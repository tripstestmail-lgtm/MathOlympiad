<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:orientation="vertical" android:background="@color/navy"
    android:padding="20dp">

    <!-- Header Row -->
    <LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content"
        android:orientation="horizontal" android:gravity="center_vertical"
        android:layout_marginBottom="12dp">

        <TextView android:id="@+id/tvQuestionCounter"
            android:layout_width="0dp" android:layout_height="wrap_content"
            android:layout_weight="1" android:text="Q 1 of 5"
            android:textSize="14sp" android:textColor="#AABBCC"/>

        <LinearLayout android:id="@+id/layoutTimer"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:orientation="horizontal" android:gravity="center_vertical"
            android:background="@drawable/card_bg" android:paddingHorizontal="12dp"
            android:paddingVertical="6dp">
            <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:text="⏱ " android:textSize="14sp"/>
            <TextView android:id="@+id/tvTimer"
                android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:text="2:00" android:textSize="18sp" android:textStyle="bold"
                android:textColor="@color/gold"/>
        </LinearLayout>
    </LinearLayout>

    <!-- Progress Bar -->
    <ProgressBar android:id="@+id/progressBarQuiz"
        style="?android:attr/progressBarStyleHorizontal"
        android:layout_width="match_parent" android:layout_height="8dp"
        android:max="5" android:progress="0"
        android:progressTint="@color/gold"
        android:progressBackgroundTint="#222255"
        android:layout_marginBottom="16dp"/>

    <!-- Section Badge -->
    <TextView android:id="@+id/tvSection"
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:text="Logical Reasoning"
        android:background="@drawable/badge_bg" android:paddingHorizontal="12dp"
        android:paddingVertical="4dp" android:textColor="@color/gold"
        android:textSize="11sp" android:letterSpacing="0.1"
        android:layout_marginBottom="12dp"/>

    <!-- Question Card -->
    <LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content"
        android:background="@drawable/card_bg" android:padding="20dp"
        android:layout_marginBottom="16dp">
        <TextView android:id="@+id/tvQuestion"
            android:layout_width="match_parent" android:layout_height="wrap_content"
            android:text="Question text here"
            android:textSize="16sp" android:textColor="@color/white"
            android:lineSpacingMultiplier="1.4"/>
    </LinearLayout>

    <!-- Options -->
    <ScrollView android:layout_width="match_parent" android:layout_height="0dp"
        android:layout_weight="1">
        <LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content"
            android:orientation="vertical">

            <Button android:id="@+id/btn0" android:layout_width="match_parent"
                android:layout_height="52dp" android:text="A. Option"
                android:textColor="@color/white" android:gravity="start|center_vertical"
                android:paddingStart="16dp" android:backgroundTint="#1A1A6E"
                android:layout_marginBottom="10dp"/>
            <Button android:id="@+id/btn1" android:layout_width="match_parent"
                android:layout_height="52dp" android:text="B. Option"
                android:textColor="@color/white" android:gravity="start|center_vertical"
                android:paddingStart="16dp" android:backgroundTint="#1A1A6E"
                android:layout_marginBottom="10dp"/>
            <Button android:id="@+id/btn2" android:layout_width="match_parent"
                android:layout_height="52dp" android:text="C. Option"
                android:textColor="@color/white" android:gravity="start|center_vertical"
                android:paddingStart="16dp" android:backgroundTint="#1A1A6E"
                android:layout_marginBottom="10dp"/>
            <Button android:id="@+id/btn3" android:layout_width="match_parent"
                android:layout_height="52dp" android:text="D. Option"
                android:textColor="@color/white" android:gravity="start|center_vertical"
                android:paddingStart="16dp" android:backgroundTint="#1A1A6E"
                android:layout_marginBottom="10dp"/>

            <!-- Timeout Message -->
            <TextView android:id="@+id/tvTimeoutMsg"
                android:layout_width="match_parent" android:layout_height="wrap_content"
                android:text="⏰ Time's up! The correct answer is highlighted above."
                android:textColor="#FF9999" android:textSize="14sp"
                android:background="#331111" android:padding="12dp"
                android:visibility="gone" android:layout_marginBottom="10dp"/>

            <!-- Share Questions (practice mode) -->
            <Button android:id="@+id/btnShareQuestions"
                android:layout_width="match_parent" android:layout_height="48dp"
                android:text="📤  Share This Question Set"
                android:backgroundTint="#112244" android:textColor="@color/gold"
                android:textSize="14sp" android:visibility="gone"
                android:layout_marginBottom="8dp"/>

            <!-- Next Button -->
            <Button android:id="@+id/btnNext"
                android:layout_width="match_parent" android:layout_height="56dp"
                android:text="Next Question →"
                android:backgroundTint="@color/gold" android:textColor="@color/navy"
                android:textSize="17sp" android:textStyle="bold"
                android:visibility="gone" android:layout_marginBottom="16dp"/>

        </LinearLayout>
    </ScrollView>
</LinearLayout>
