package com.example.mobfinalmenuplusnavbar.ui.main;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mobfinalmenuplusnavbar.R;
import java.util.ArrayList;
import java.util.Objects;

public class MainFragment extends Fragment {

    private static final String TAG = "MainFragment";

    private ArrayList<Integer> cardRecyclerLogos = new ArrayList<>();
    private ArrayList<String> cardRecyclerBankNames = new ArrayList<>();
    private ArrayList<String> cardRecyclerCashes = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onStart() {
        super.onStart();

        initCards();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void initCards() {
        Log.d(TAG, "initCards");

        cardRecyclerLogos.add(R.drawable.halyk);
        cardRecyclerBankNames.add("Halyk Bank");
        cardRecyclerCashes.add("80 000 T");

        cardRecyclerLogos.add(R.drawable.jusan);
        cardRecyclerBankNames.add("Jusan Bank");
        cardRecyclerCashes.add("50 000 T");

        cardRecyclerLogos.add(R.drawable.kaspi);
        cardRecyclerBankNames.add("Kaspi Bank");
        cardRecyclerCashes.add("10 000 T");

        cardRecyclerLogos.add(R.drawable.halyk);
        cardRecyclerBankNames.add("Halyk Bank");
        cardRecyclerCashes.add("80 000 T");

        cardRecyclerLogos.add(R.drawable.jusan);
        cardRecyclerBankNames.add("Jusan Bank");
        cardRecyclerCashes.add("50 000 T");

        cardRecyclerLogos.add(R.drawable.kaspi);
        cardRecyclerBankNames.add("Kaspi Bank");
        cardRecyclerCashes.add("10 000 T");

        cardRecyclerLogos.add(R.drawable.halyk);
        cardRecyclerBankNames.add("Halyk Bank");
        cardRecyclerCashes.add("80 000 T");

        cardRecyclerLogos.add(R.drawable.jusan);
        cardRecyclerBankNames.add("Jusan Bank");
        cardRecyclerCashes.add("50 000 T");

        cardRecyclerLogos.add(R.drawable.kaspi);
        cardRecyclerBankNames.add("Kaspi Bank");
        cardRecyclerCashes.add("10 000 T");

        initRecyclerView();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView recyclerView = requireView().findViewById(R.id.cardRecyclerView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this.getContext(), cardRecyclerLogos, cardRecyclerBankNames, cardRecyclerCashes);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

    }

}
