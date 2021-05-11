package com.ankit.bottomsheetdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    ModalBottomSheet bottomSheet = new ModalBottomSheet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        bottomSheet.show(getSupportFragmentManager(), "ModalBottomSheet");
    }

    public static class ModalBottomSheet extends BottomSheetDialogFragment {
        Button btnHideBottomSheet;

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.bottom_sheet_item_view, container, false);

            btnHideBottomSheet = v.findViewById(R.id.btnHideBottomSheet);

            btnHideBottomSheet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dismiss();
                }
            });

            return v;
        }
    }
}