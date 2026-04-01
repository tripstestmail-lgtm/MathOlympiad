<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:background="@color/navy">

    <LinearLayout android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical" android:gravity="center_horizontal"
        android:padding="24dp">

        <!-- Emoji -->
        <TextView android:id="@+id/tvEmoji"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="🏆" android:textSize="72sp"
            android:layout_marginTop="16dp" android:layout_marginBottom="8dp"/>

        <!-- Score -->
        <TextView android:id="@+id/tvScore"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="0 / 5" android:textSize="48sp" android:textStyle="bold"
            android:textColor="@color/gold"/>

        <!-- Mode Label -->
        <TextView android:id="@+id/tvModeLabel"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="Daily Assessment" android:textSize="12sp"
            android:textColor="#88AABB" android:layout_marginBottom="4dp"/>

        <!-- Title -->
        <TextView android:id="@+id/tvResultTitle"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="Great Job!" android:textSize="26sp" android:textStyle="bold"
            android:textColor="@color/white"/>

        <!-- Sub -->
        <TextView android:id="@+id/tvResultSub"
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="Keep practicing!" android:textSize="14sp"
            android:textColor="#AABBCC" android:gravity="center"
            android:layout_marginBottom="24dp"/>

        <!-- Action Buttons -->
        <Button android:id="@+id/btnShareScore"
            android:layout_width="match_parent" android:layout_height="52dp"
            android:text="📤  Share My Score"
            android:backgroundTint="@color/gold" android:textColor="@color/navy"
            android:textStyle="bold" android:layout_marginBottom="10dp"/>

        <Button android:id="@+id/btnShareQuestionsOnly"
            android:layout_width="match_parent" android:layout_height="48dp"
            android:text="📋  Share Questions (without answers)"
            android:backgroundTint="#1A1A6E" android:textColor="@color/white"
            android:textSize="14sp" android:layout_marginBottom="8dp"/>

        <Button android:id="@+id/btnShareWithAnswers"
            android:layout_width="match_parent" android:layout_height="48dp"
            android:text="📖  Share Questions + Answers + Explanations"
            android:backgroundTint="#1A1A6E" android:textColor="@color/gold"
            android:textSize="14sp" android:layout_marginBottom="8dp"/>

        <Button android:id="@+id/btnHome"
            android:layout_width="match_parent" android:layout_height="48dp"
            android:text="🏠  Back to Home"
            android:backgroundTint="#111133" android:textColor="@color/white"
            android:textSize="15sp" android:layout_marginBottom="28dp"/>

        <!-- Review Section Title -->
        <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="📝  QUESTION REVIEW"
            android:textSize="12sp" android:letterSpacing="0.15"
            android:textColor="#AABBCC" android:layout_marginBottom="16dp"/>

        <!-- Review Items Container -->
        <LinearLayout android:id="@+id/layoutReview"
            android:layout_width="match_parent" android:layout_height="wrap_content"
            android:orientation="vertical" android:layout_marginBottom="32dp"/>

    </LinearLayout>
</ScrollView>
