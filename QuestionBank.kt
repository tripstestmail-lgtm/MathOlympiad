<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:background="@color/navy" android:fillViewport="true">

    <LinearLayout android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical" android:gravity="center_horizontal"
        android:padding="24dp">

        <!-- Logo -->
        <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="🏆" android:textSize="72sp"
            android:layout_marginTop="24dp" android:layout_marginBottom="4dp"/>

        <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="IMO Daily Quiz"
            android:textSize="32sp" android:textStyle="bold"
            android:textColor="@color/gold" android:fontFamily="sans-serif-medium"/>

        <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="CLASS 3  ·  MATH OLYMPIAD"
            android:textSize="11sp" android:letterSpacing="0.15"
            android:textColor="#88AABB" android:layout_marginBottom="28dp"/>

        <!-- Stats Row -->
        <LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content"
            android:orientation="horizontal" android:layout_marginBottom="20dp"
            android:background="@drawable/card_bg" android:padding="16dp">

            <LinearLayout android:layout_width="0dp" android:layout_height="wrap_content"
                android:layout_weight="1" android:orientation="vertical" android:gravity="center">
                <TextView android:id="@+id/tvStreak" android:layout_width="wrap_content"
                    android:layout_height="wrap_content" android:text="0"
                    android:textSize="28sp" android:textStyle="bold" android:textColor="@color/gold"/>
                <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                    android:text="🔥 Streak" android:textSize="11sp" android:textColor="#88AABB"/>
            </LinearLayout>

            <LinearLayout android:layout_width="0dp" android:layout_height="wrap_content"
                android:layout_weight="1" android:orientation="vertical" android:gravity="center">
                <TextView android:id="@+id/tvTotalDays" android:layout_width="wrap_content"
                    android:layout_height="wrap_content" android:text="0"
                    android:textSize="28sp" android:textStyle="bold" android:textColor="@color/gold"/>
                <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                    android:text="📅 Days" android:textSize="11sp" android:textColor="#88AABB"/>
            </LinearLayout>

            <LinearLayout android:layout_width="0dp" android:layout_height="wrap_content"
                android:layout_weight="1" android:orientation="vertical" android:gravity="center">
                <TextView android:id="@+id/tvBestScore" android:layout_width="wrap_content"
                    android:layout_height="wrap_content" android:text="0/5"
                    android:textSize="28sp" android:textStyle="bold" android:textColor="@color/gold"/>
                <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                    android:text="⭐ Best" android:textSize="11sp" android:textColor="#88AABB"/>
            </LinearLayout>
        </LinearLayout>

        <!-- Done Today Card -->
        <LinearLayout android:id="@+id/cardDoneToday"
            android:layout_width="match_parent" android:layout_height="wrap_content"
            android:orientation="vertical" android:gravity="center"
            android:background="@drawable/card_green_bg" android:padding="16dp"
            android:layout_marginBottom="16dp" android:visibility="gone">
            <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:text="✅  Today's quiz done!" android:textColor="#88FF99"
                android:textSize="15sp" android:textStyle="bold"/>
            <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
                android:text="Come back tomorrow at 7 PM for a new set."
                android:textColor="#AADDAA" android:textSize="13sp" android:gravity="center"/>
        </LinearLayout>

        <!-- Buttons -->
        <Button android:id="@+id/btnStartQuiz"
            android:layout_width="match_parent" android:layout_height="56dp"
            android:text="▶  Start Today's Quiz"
            android:textSize="17sp" android:textStyle="bold"
            android:backgroundTint="@color/gold" android:textColor="@color/navy"
            android:layout_marginBottom="12dp"/>

        <Button android:id="@+id/btnPracticeMode"
            android:layout_width="match_parent" android:layout_height="52dp"
            android:text="📖  Practice Mode"
            android:textSize="16sp"
            android:backgroundTint="#1A1A6E"
            android:textColor="@color/gold"
            android:layout_marginBottom="12dp"/>

        <Button android:id="@+id/btnHistory"
            android:layout_width="match_parent" android:layout_height="52dp"
            android:text="📊  View History"
            android:textSize="16sp"
            android:backgroundTint="#1A1A6E"
            android:textColor="@color/white"
            android:layout_marginBottom="12dp"/>

        <Button android:id="@+id/btnEnableNotif"
            android:layout_width="match_parent" android:layout_height="52dp"
            android:text="🔔  Enable 7 PM Reminders"
            android:textSize="14sp"
            android:backgroundTint="#112244"
            android:textColor="#F5C518"
            android:layout_marginBottom="24dp"/>

    </LinearLayout>
</ScrollView>
