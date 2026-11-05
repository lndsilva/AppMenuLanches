package br.com.local.appmenulanches;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;


public class LanchesActivity extends AppCompatActivity {

    //Variável global
    MaterialToolbar toolBarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.lanches_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        toolBarMenu = findViewById(R.id.toolBarMenu);

        //Navigation icon - seta de voltar
        toolBarMenu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em voltar", Toast.LENGTH_SHORT).show();

            }
        });

        //Lista de itens do menu
        toolBarMenu.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.mHome) {
                    Toast.makeText(getApplicationContext(), "Cliquei em home", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mBooks) {
                    Toast.makeText(getApplicationContext(), "Cliquei em books", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mLocal) {
                    Toast.makeText(getApplicationContext(), "Cliquei em Local", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSearch) {
                    Toast.makeText(getApplicationContext(), "Cliquei em search", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSee) {
                    Toast.makeText(getApplicationContext(), "Cliquei em see", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });


    }


}