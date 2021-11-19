package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] board ={"","","","","","","","",""};
    String turn;
    boolean winner;
    boolean gameActive;
    ImageView interaction;
    int counter;
    ArrayList<ImageView> winRow0,winRow1,winRow2,winCol0,winCol1,winCol2,winDiagLeft,winDiagRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn="X";
        gameActive = true;
        winner =false;
        counter=0;
        interaction = findViewById(R.id.main_interaction);
        setListeners();
        prepareWinDrawings();
    }

    private void setListeners() {
        findViewById(R.id.main_imbtn_0).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&& board[0].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_0);
                    board[0] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_0);
                    board[0] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_1).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[1].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_1);
                    board[1] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_1);
                    board[1] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_2).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[2].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_2);
                    board[2] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_2);
                    board[2] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_3).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[3].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_3);
                    board[3] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_3);
                    board[3] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_4).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[4].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_4);
                    board[4] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_4);
                    board[4] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_5).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[5].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_5);
                    board[5] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_5);
                    board[5] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_6).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[6].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_6);
                    board[6] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_6);
                    board[6] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_7).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[7].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_7);
                    board[7] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_7);
                    board[7] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_imbtn_8).setOnClickListener(v ->{
            ImageView img;
            if(gameActive&&board[8].equals("")){
                if(turn.equals("X")){
                    img = findViewById(R.id.main_x_imv_8);
                    board[8] = "X";
                    turn = "O";
                    interaction.setImageResource(R.drawable.oplay);
                }
                else{
                    img = findViewById(R.id.main_o_imv_8);
                    board[8] = "O";
                    turn = "X";
                    interaction.setImageResource(R.drawable.xplay);
                }
                img.setTranslationY(-1000f);
                img.animate().translationYBy(1000f).setDuration(300);
                img.setVisibility(View.VISIBLE);
                counter++;
                checkWinner();
            }
        });

        findViewById(R.id.main_restart_btn).setOnClickListener(v->{
            turn="X";
            gameActive = true;
            counter=0;
            winner =false;
            board= new String[]{"", "", "", "", "", "", "", "", ""};
            for(ImageView iv : this.winRow0)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winRow1)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winRow2)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winCol0)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winCol1)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winCol2)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winDiagLeft)
                iv.setVisibility(View.INVISIBLE);
            for(ImageView iv : this.winDiagRight)
                iv.setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_0).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_6).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_7).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_x_imv_8).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_0).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_2).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_3).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_4).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_5).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_6).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_7).setVisibility(View.INVISIBLE);
            findViewById(R.id.main_o_imv_8).setVisibility(View.INVISIBLE);
            interaction.setImageResource(R.drawable.xplay);
        });

    }

    private void prepareWinDrawings() {
        winRow0 = new ArrayList<>();
        winRow1 = new ArrayList<>();
        winRow2 = new ArrayList<>();
        winCol0 = new ArrayList<>();
        winCol1 = new ArrayList<>();
        winCol2 = new ArrayList<>();
        winDiagLeft = new ArrayList<>();
        winDiagRight = new ArrayList<>();

        winRow0.add(findViewById(R.id.main_win_hor_imv_0));
        winRow0.add(findViewById(R.id.main_win_hor_imv_1));
        winRow0.add(findViewById(R.id.main_win_hor_imv_2));

        winRow1.add(findViewById(R.id.main_win_hor_imv_3));
        winRow1.add(findViewById(R.id.main_win_hor_imv_4));
        winRow1.add(findViewById(R.id.main_win_hor_imv_5));

        winRow2.add(findViewById(R.id.main_win_hor_imv_6));
        winRow2.add(findViewById(R.id.main_win_hor_imv_7));
        winRow2.add(findViewById(R.id.main_win_hor_imv_8));

        winCol0.add(findViewById(R.id.main_win_ver_imv_0));
        winCol0.add(findViewById(R.id.main_win_ver_imv_3));
        winCol0.add(findViewById(R.id.main_win_ver_imv_6));

        winCol1.add(findViewById(R.id.main_win_ver_imv_1));
        winCol1.add(findViewById(R.id.main_win_ver_imv_4));
        winCol1.add(findViewById(R.id.main_win_ver_imv_7));

        winCol2.add(findViewById(R.id.main_win_ver_imv_2));
        winCol2.add(findViewById(R.id.main_win_ver_imv_5));
        winCol2.add(findViewById(R.id.main_win_ver_imv_8));

        winDiagLeft.add(findViewById(R.id.main_win_diag_left_imv_2));
        winDiagLeft.add(findViewById(R.id.main_win_diag_left_imv_4));
        winDiagLeft.add(findViewById(R.id.main_win_diag_left_imv_6));

        winDiagRight.add(findViewById(R.id.main_win_diag_right_imv_0));
        winDiagRight.add(findViewById(R.id.main_win_diag_right_imv_4));
        winDiagRight.add(findViewById(R.id.main_win_diag_right_imv_8));
    }

    private void checkWinner() {
        if(counter<5)
            return;
        //no winner
        //8 winning options
        String winRow0 = board[0] + board[1]+ board[2];
        String winRow1 = board[3] + board[4]+ board[5];
        String winRow2 = board[6] + board[7]+ board[8];
        String winCol0 = board[0] + board[3]+ board[6];
        String winCol1 = board[1] + board[4]+ board[7];
        String winCol2 = board[2] + board[5]+ board[8];
        String winDiagRight = board[0] + board[4]+ board[8];
        String winDiagLeft = board[2] + board[4]+ board[6];

        if(winRow0.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winRow0)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winRow0.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winRow0)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winRow1.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winRow1)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winRow1.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winRow1)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winRow2.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winRow2)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winRow2.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winRow2)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol0.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winCol0)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol0.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winCol0)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol1.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winCol1)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol1.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winCol1)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol2.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winCol2)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winCol2.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winCol2)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winDiagLeft.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winDiagLeft)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winDiagLeft.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winDiagLeft)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winDiagRight.equals("XXX")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.xwin);
            for(ImageView iv : this.winDiagRight)
                iv.setVisibility(View.VISIBLE);
        }
        else if(winDiagRight.equals("OOO")){
            gameActive=false;
            winner=true;
            interaction.setImageResource(R.drawable.owin);
            for(ImageView iv : this.winDiagRight)
                iv.setVisibility(View.VISIBLE);
        }

        if(counter==9&&!winner){
            gameActive=false;
            interaction.setImageResource(R.drawable.nowin);
        }

    }
}