package com.it355.jed.rules;
//Rule: SER08-J  - Minimize privileges before deserializing from a privileged context
//Matt Holliday

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.SerializablePermission;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;

public class SER08_Main implements Serializable{
//Access control class    
private static class AccessControl{
    private static final AccessControlContext INSTANCE;
    static{
        SerializablePermission permission = new SerializablePermission("name");
        PermissionCollection perms = permission.newPermissionCollection();
        perms.add(permission);
        INSTANCE = new AccessControlContext(new ProtectionDomain[]{
            new ProtectionDomain(null, perms)
        });

    }
}

    public static void main(String[] args) {
        
        SER08_Main obj = new SER08_Main();
        //serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SER08.dat"))) {
            oos.writeObject(obj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        //deserialize
        try {
            SER08_Main deserObj = AccessController.doPrivileged(new PrivilegedExceptionAction<SER08_Main>() {
                public SER08_Main run() throws Exception {
                   try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SER08.dat"))) {
                     return (SER08_Main) ois.readObject();
                   }
                }
            }, AccessControl.INSTANCE);
        } catch (PrivilegedActionException e) {
            e.printStackTrace();
        }
        if(obj != null)
        {
            obj = null;
        }
    }


}
