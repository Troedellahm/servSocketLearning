package de.maxximus2.servertryout1;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.net.*;
import java.io.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8555);
			}
		catch (IOException e) {
			System.exit(-1);
		}
		
		Socket clSock = null;
		try {
			clSock = serverSocket.accept();
			}
		catch (IOException e) {
			System.exit(-1);
		}
		try {
			PrintWriter out = new PrintWriter(clSock.getOutputStream(),true);
			BufferedReader in = new BufferedReader(
								new InputStreamReader(
								clSock.getInputStream()));
			String input, outline;
			
			while ((input = in.readLine()) != null) {
				//outline 
			}
		}
		catch (IOException e) {
			System.exit(-1);
		}
    }
}
