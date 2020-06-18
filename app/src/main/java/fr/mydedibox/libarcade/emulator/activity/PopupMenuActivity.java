package fr.mydedibox.libarcade.emulator.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.view.ActionMode;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.greatlittleapps.utility.Utility;
import com.greatlittleapps.utility.UtilityMessage;
import com.qn.afba.R;

import java.lang.reflect.Field;

import fr.mydedibox.libarcade.emulator.StateAdapter;
import fr.mydedibox.libarcade.emulator.StateInfo;
import fr.mydedibox.libarcade.emulator.StateList;
import fr.mydedibox.libarcade.emulator.effects.Effect;
import fr.mydedibox.libarcade.emulator.effects.EffectList;
import fr.mydedibox.libarcade.emulator.input.HardwareInput;
import fr.mydedibox.libarcade.emulator.input.IButtons;
import fr.mydedibox.libarcade.emulator.sdl.SDLAudio;
import fr.mydedibox.libarcade.emulator.sdl.SDLJni;
import fr.mydedibox.libarcade.emulator.sdl.SDLSurface;
import fr.mydedibox.libarcade.emulator.utility.EmuPreferences;

//import fr.mydedibox.libarcade.R;

/**
    SDL Activity
*/
public class PopupMenuActivity extends Activity implements OnKeyListener
{


    String[] a = {"1번", "2번","3번","4번"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        Button b = (Button)findViewById(R.id.button);
//        b.setOnClickListener(new Button.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                new AlertDialog.Builder(Dialog.this)
//                        .setTitle("select list").setIcon(R.drawable.icon)
//                        .setItems(a, new DialogInterface.OnClickListener() {
//
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                // TODO Auto-generated method stub
//                                TextView text = (TextView)findViewById(R.id.text);
//                                text.setText(""+dialog+"//"+a[which]);
//                            }
//                        }).setNegativeButton("취소", null).show();
//            }
//        });
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }
}
