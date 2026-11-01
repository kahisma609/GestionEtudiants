Overview

This project implements the home screen interface (MainActivity) for PrésenceManager, an Android application designed to track and manage trainee attendance.

The primary goal of this assignment is to build a responsive, modern UI layout in XML adhering strictly to layout weights, padding, margins, custom color palettes, and component ID requirements.

Technical Stack

Language: Kotlin

UI Framework: Android XML Layouts

Base Components: LinearLayout, ImageView, TextView, Button

Minimum SDK: API 24+

Layout Structure & Implementation

1. Root Container (layoutAccueil)

Type: Vertical LinearLayout

Configuration: Covers the full screen (match_parent) with 24dp uniform outer padding and background color #F8FAFC.

Purpose: Acts as the primary container holding both the central content block and the bottom footer.

2. Centered Content Block

Configuration: layout_height="0dp" with layout_weight="1" and gravity="center".

Purpose: Dynamically expands to fill available screen height while centering all inner components vertically and horizontally across different screen sizes.

Components:

imgLogo (ImageView): Displays the @drawable/logo_presence icon at a fixed 110dp x 110dp dimension.

txtTitre (TextView): Main header styled in 28sp, bold, using primary dark blue #1E3A5F with 30dp top margin.

txtDescription (TextView): Subtitle text rendered at 16sp in slate gray #64748B with 12dp top margin.

btnCommernicer (Button): Action trigger spanning full width with a fixed height of 56dp, background color #2563EB, and bold white 16sp text.

3. Footer Section (txtFooter)

Type: TextView

Configuration: Positioned at the bottom of the outer LinearLayout with 12dp bottom margin.

Styling: Small 12sp muted gray text (#94A3B8) indicating app version release (Présence Manager - Version 1.0).

Kotlin Activity Controller (MainActivity.kt)

The MainActivity class serves as the entry point controller, instantiating the view layout via setContentView(R.layout.activity_main) inside the onCreate lifecycle method.

package com.example.presencemanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


How to Run

Open the project in Android Studio.

Place a valid image asset named logo_presence.png into app/src/main/res/drawable/.

Build and run on an Android Virtual Device (AVD) or physical device.
