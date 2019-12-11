package net.arsenalnetwork.softwares;

import app.open.software.yivesmirror.ServerSoftware;
import app.open.software.yivesmirror.ServerSoftwareName;
import app.open.software.yivesmirror.Yivesmirror;

public class GetServerSoftwares {

    public static void getSoftwares() throws Exception {
        //create an instance
        Yivesmirror yivesmirror = new Yivesmirror();

       //get server softwares; select the first
        ServerSoftwareName name = yivesmirror.getServerSoftwareNames().get(0);

        //get versions of the server softwares; select the first; get Serversoftware
        ServerSoftware software = name.getVersions().get(0).getServerSoftware();

        //get a input stream / download
        software.download();
    }

}
