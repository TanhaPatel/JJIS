package com.example.jjis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

import java.util.List;

public class StudyMaterial extends AppCompatActivity {

    TextView chap1TV, chap2TV, chap3TV, chap4TV, chap5TV, chap6TV, chap7TV,
             chap8TV, chap9TV, chap10TV, chap11TV, chap12TV, chap13TV, chap14TV,
             chap15TV, chap16TV, chap17TV, chap18TV, chap19TV, chap20TV, chap21TV,
             chap22TV, chap23TV, chap24TV, chap25TV, subname;

    CardView chap1, chap2, chap3, chap4, chap5, chap6, chap7, chap8, chap9, chap10,
             chap11, chap12, chap13, chap14, chap15, chap16, chap17, chap18, chap19,
             chap20, chap21, chap22, chap23, chap24, chap25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        subname = findViewById(R.id.subname);

        chap1TV = findViewById(R.id.chap1TV); chap2TV = findViewById(R.id.chap2TV); chap3TV = findViewById(R.id.chap3TV);
        chap4TV = findViewById(R.id.chap4TV); chap5TV = findViewById(R.id.chap5TV); chap6TV = findViewById(R.id.chap6TV);
        chap7TV = findViewById(R.id.chap7TV); chap8TV = findViewById(R.id.chap8TV); chap9TV = findViewById(R.id.chap9TV);
        chap10TV = findViewById(R.id.chap10TV); chap11TV = findViewById(R.id.chap11TV); chap12TV = findViewById(R.id.chap12TV);
        chap13TV = findViewById(R.id.chap13TV); chap14TV = findViewById(R.id.chap14TV); chap15TV = findViewById(R.id.chap15TV);
        chap16TV = findViewById(R.id.chap16TV); chap17TV = findViewById(R.id.chap17TV); chap18TV = findViewById(R.id.chap18TV);
        chap19TV = findViewById(R.id.chap19TV); chap20TV = findViewById(R.id.chap20TV); chap21TV = findViewById(R.id.chap21TV);
        chap22TV = findViewById(R.id.chap22TV); chap23TV = findViewById(R.id.chap23TV); chap24TV = findViewById(R.id.chap24TV);
        chap25TV = findViewById(R.id.chap25TV);

        chap1 = findViewById(R.id.chap1); chap2 = findViewById(R.id.chap2); chap3 = findViewById(R.id.chap3);
        chap4 = findViewById(R.id.chap4); chap5 = findViewById(R.id.chap5); chap6 = findViewById(R.id.chap6);
        chap7 = findViewById(R.id.chap7); chap8 = findViewById(R.id.chap8); chap9 = findViewById(R.id.chap9);
        chap10 = findViewById(R.id.chap10); chap11 = findViewById(R.id.chap11); chap12 = findViewById(R.id.chap12);
        chap13 = findViewById(R.id.chap13); chap14 = findViewById(R.id.chap14); chap15 = findViewById(R.id.chap15);
        chap16 = findViewById(R.id.chap16); chap17 = findViewById(R.id.chap17); chap18 = findViewById(R.id.chap18);
        chap19 = findViewById(R.id.chap19); chap20 = findViewById(R.id.chap20); chap21 = findViewById(R.id.chap21);
        chap22 = findViewById(R.id.chap22); chap23 = findViewById(R.id.chap23); chap24 = findViewById(R.id.chap24);
        chap25 = findViewById(R.id.chap25);

        String sub = getIntent().getStringExtra("subject_name");
        String course = getIntent().getStringExtra("course_name");
        final String std = getIntent().getStringExtra("standard");
        final String show = course + " " + sub;
        subname.setText(show);

//NAMING CHAPTERS OF STANDARD 11TH

        if(std.equals("11")) {
            if (show.equals("GSEB" + " " + "Physics")) {
                chap1TV.setText("Physical World");
                chap2TV.setText("Units and Measurements");
                chap3TV.setText("Motion in a Straight Line");
                chap4TV.setText("Motion in a Plane");
                chap5TV.setText("Laws of Motion");
                chap6TV.setText("Work, Energy, and Power");
                chap7TV.setText("System of Particles and Rotational Motion");
                chap8TV.setText("Gravitation");
                chap9TV.setText("Mechanical Properties of Solids");
                chap10TV.setText("Mechanical Properties of Fluids");
                chap11TV.setText("Thermal Properties of Matter");
                chap12TV.setText("Thermodynamics");
                chap13TV.setText("Kinetic Theory");
                chap14TV.setText("Oscillations");
                chap15TV.setText("Waves");
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Chemistry")) {
                chap1TV.setText("Some Basic Concepts of Chemistry");
                chap2TV.setText("Structure of Atom");
                chap3TV.setText("Classification of Elements and Periodicity in Properties");
                chap4TV.setText("Chemical Bonding and Molecular Structure");
                chap5TV.setText("States of Matter");
                chap6TV.setText("Thermodynamics");
                chap7TV.setText("Equilibrium");
                chap8TV.setText("Redox Reactions");
                chap9TV.setText("Hydrogen");
                chap10TV.setText("s-Block Elements");
                chap11TV.setText("p-Bock Elements");
                chap12TV.setText("Organic Chemistry- Some Basic Principles and Techniques");
                chap13TV.setText("Hydrocarbons");
                chap14TV.setText("Environmental Chemistry");
                chap15.setVisibility(View.GONE);
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Maths")) {
                chap1TV.setText("Sets");
                chap2TV.setText("Relations and Functions");
                chap3TV.setText("Trigonometric Functions");
                chap4TV.setText("Principle of Mathematical Induction");
                chap5TV.setText("Complex Numbers and Quadractic Equations");
                chap6TV.setText("Linear Inequalities");
                chap7TV.setText("Permutation and Combinations");
                chap8TV.setText("Binomial Theorem");
                chap9TV.setText("Sequences and Series");
                chap10TV.setText("Straight Lines");
                chap11TV.setText("Conic Sections");
                chap12TV.setText("Introduction to Three Dimensional Geometry");
                chap13TV.setText("Limits and Derivatives");
                chap14TV.setText("Mathematical Reasoning");
                chap15TV.setText("Statistics");
                chap16TV.setText("Probability");
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Biology")) {
                chap1TV.setText("The Living World");
                chap2TV.setText("Biological Classification");
                chap3TV.setText("Plant Kingdom");
                chap4TV.setText("Animal Kingdom");
                chap5TV.setText("Morphology of Flowering Plants");
                chap6TV.setText("Anatomy of Flowering Plants");
                chap7TV.setText("Structural Organisation in Animals");
                chap8TV.setText("Cell: The Unit of Life");
                chap9TV.setText("Biomolecules");
                chap10TV.setText("Cell Cycle and Cell Division");
                chap11TV.setText("Transport in Plants");
                chap12TV.setText("Mineral Nutrition");
                chap13TV.setText("Photosynthesis in Higher Plants");
                chap14TV.setText("Respiration in Plants");
                chap15TV.setText("Plant Growth and Development");
                chap16TV.setText("Digestion and Absorption");
                chap17TV.setText("Breathing and Exchange of Gases");
                chap18TV.setText("Body Fluids and Circulation");
                chap19TV.setText("Excretory Products and their Elimination");
                chap20TV.setText("Locomotion and Movement");
                chap21TV.setText("Neural Control and Coordination");
                chap22TV.setText("Chemical Coordination and Integration");
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "English")) {
                chap1TV.setText("The Portrait of a Lady");
                chap2TV.setText("A Photography");
                chap3TV.setText("We're Not Afraaid to Die... if We Can be Together");
                chap4TV.setText("Discovering Tut: The Saga Continues");
                chap5TV.setText("The Laburnum Top");
                chap6TV.setText("Landscape of the Soul");
                chap7TV.setText("The Voice of the Rain");
                chap8TV.setText("The Ailing Planet: The Green Movement's Role");
                chap9TV.setText("The Browning Version");
                chap10TV.setText("Childhood");
                chap11TV.setText("The Adventure");
                chap12TV.setText("Silk Road");
                chap13TV.setText("Father to Son");
                chap14TV.setText("The Summer of the Beautiful White House");
                chap15TV.setText("The Address");
                chap16TV.setText("Ranga's Marraige");
                chap17TV.setText("Albert Einstein at School");
                chap18TV.setText("Mother's Day");
                chap19TV.setText("The Ghat of the Only World");
                chap20TV.setText("Birth");
                chap21TV.setText("The Tale of Melon City");
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Computer")) {
                chap1TV.setText("Introduction to Multimedia");
                chap2TV.setText("Animation Tool: Synfig");
                chap3TV.setText("Creating Animation Using Synfig");
                chap4TV.setText("Introduction to Layers");
                chap5TV.setText("Using Pictures in Synfig");
                chap6TV.setText("Basic Ubuntu Linux Commands");
                chap7TV.setText("SVim Editor and Basic Scripting");
                chap8TV.setText("Advanced Scripting");
                chap9TV.setText("Introduction to Database Management System");
                chap10TV.setText("Working with Tables");
                chap11TV.setText("Retrieving Data Using Queries");
                chap12TV.setText("Forms and Reports");
                chap13TV.setText("Current Trends and Technologies");
                chap14.setVisibility(View.GONE);
                chap15.setVisibility(View.GONE);
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);
            }
        }

//NAMING CHAPTERS OF STANDARD 12TH

        if(std.equals("12")) {
            if (show.equals("GSEB" + " " + "Physics")) {
                chap1TV.setText("Electric Charges and Fields");
                chap2TV.setText("Electrostatic Potential and Capacitance");
                chap3TV.setText("Current Electricity");
                chap4TV.setText("Moving Charges and Magnetism");
                chap5TV.setText("MAgnetism and Matter");
                chap6TV.setText("Electromagnetic Induction");
                chap7TV.setText("Alternating Current");
                chap8TV.setText("Electromagnetic Waves");
                chap9TV.setText("Ray Optics and Optical Instruments");
                chap10TV.setText("Wave Optics");
                chap11TV.setText("Dual Nature of Radiation and Matter");
                chap12TV.setText("Atoms");
                chap13TV.setText("Nuclei");
                chap14TV.setText("Semiconductors");
                chap15TV.setText("Communication Systems");
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Chemistry")) {
                chap1TV.setText("The Solid State");
                chap2TV.setText("Solutions");
                chap3TV.setText("Electrochemistry");
                chap4TV.setText("Chemical Kinetics");
                chap5TV.setText("Surface Chemistry");
                chap6TV.setText("General Principles and Processes of Isolation of Elements");
                chap7TV.setText("p-Block Elements");
                chap8TV.setText("d-and f-Block Elements");
                chap9TV.setText("Coordination Compounds");
                chap10TV.setText("Haloalkanes and Haloarenes");
                chap11TV.setText("Alcohols, Phenols, and Ethers");
                chap12TV.setText("Aldehydes, Ketones, and Carboxylic Acids");
                chap13TV.setText("Amines");
                chap14TV.setText("Biomolecules");
                chap15TV.setText("Polymers");
                chap16TV.setText("Chemistry in Everyday Life");
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Maths")) {
                chap1TV.setText("Relations ans Functions");
                chap2TV.setText("Inverse Trigonometric Functions");
                chap3TV.setText("Matrices");
                chap4TV.setText("Determinants");
                chap5TV.setText("Continuity and Differentiability");
                chap6TV.setText("Application of Derivatives");
                chap7TV.setText("Integrals");
                chap8TV.setText("Application of Integrals");
                chap9TV.setText("Differential Equations");
                chap10TV.setText("Vector Algebra");
                chap11TV.setText("Three Dimensional Geometry");
                chap12TV.setText("Linear Programming");
                chap13TV.setText("Probability");
                chap14.setVisibility(View.GONE);
                chap15.setVisibility(View.GONE);
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Biology")) {
                chap1TV.setText("Reproduction in Organisms");
                chap2TV.setText("Sexual Reproduction in Flowering Plants");
                chap3TV.setText("Human Reproduction");
                chap4TV.setText("Reproductive Health");
                chap5TV.setText("Principles of Inheritance and Variation");
                chap6TV.setText("Molecular Basis of Inheritance");
                chap7TV.setText("Evolution");
                chap8TV.setText("Human Health and Disease");
                chap9TV.setText("Strategies for Enhancement in Food Production");
                chap10TV.setText("Microbes in Human Welfare");
                chap11TV.setText("Biotechnology: Principles and Processes");
                chap12TV.setText("Biotechnology and its Applications");
                chap13TV.setText("Organisms and Population");
                chap14TV.setText("Ecosystem");
                chap15TV.setText("Biodiversity and Conservation");
                chap16TV.setText("Environmental Issues");
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "English")) {
                chap1TV.setText("The Last Lesson");
                chap2TV.setText("Lost Spring");
                chap3TV.setText("Deep Water");
                chap4TV.setText("The Rattrap");
                chap5TV.setText("Indigo");
                chap6TV.setText("Poets and Pancakes");
                chap7TV.setText("The Interview");
                chap8TV.setText("Going Places");
                chap9TV.setText("My Mother at Sixty-six");
                chap10TV.setText("An Elementary School Classroom in a Slum");
                chap11TV.setText("Keeping Quiet");
                chap12TV.setText("A Thing of Beauty");
                chap13TV.setText("A Roadside Stand");
                chap14TV.setText("Aunt Jennifer's Tigers");
                chap15TV.setText("The Third Level");
                chap16TV.setText("The Tiger King");
                chap17TV.setText("Journey to the End of the Earth");
                chap18TV.setText("The Enemy");
                chap19TV.setText("Should Wizard hit Mommy");
                chap20TV.setText("On the face of it");
                chap21TV.setText("Evans Tries an O-level");
                chap22TV.setText("Memories of Childhood");
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);

            } else if (show.equals("GSEB" + " " + "Computer")) {
                chap1TV.setText("Creating HTML forms using KompoZer");
                chap2TV.setText("Cascading Style Sheets and Java Scripts");
                chap3TV.setText("Designing Simple Websites using KompoZer");
                chap4TV.setText("Introduction to E-Commerce");
                chap5TV.setText("Introduction to M-Commerce");
                chap6TV.setText("Object-Oriented Concepts");
                chap7TV.setText("Java Basics");
                chap8TV.setText("Classes and Objects in Java");
                chap9TV.setText("Working with Array and String");
                chap10TV.setText("Exception Handling in Java");
                chap11TV.setText("File Handling");
                chap12TV.setText("Publishing documents using LaTeX");
                chap13TV.setText("Other Useful Free Tools and Services");
                chap14.setVisibility(View.GONE);
                chap15.setVisibility(View.GONE);
                chap16.setVisibility(View.GONE);
                chap17.setVisibility(View.GONE);
                chap18.setVisibility(View.GONE);
                chap19.setVisibility(View.GONE);
                chap20.setVisibility(View.GONE);
                chap21.setVisibility(View.GONE);
                chap22.setVisibility(View.GONE);
                chap23.setVisibility(View.GONE);
                chap24.setVisibility(View.GONE);
                chap25.setVisibility(View.GONE);
            }
        }

//LINKING CHAPTERS OF STANDARD 11TH

        if(std.equals("11")) {
            chap1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP1");
                    }
                }
            });

            chap2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP2");
                    }
                }
            });

            chap3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP3");
                    }
                }
            });

            chap4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP4");
                    }
                }
            });

            chap5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP5");
                    }
                }
            });

            chap6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP6");
                    }
                }
            });

            chap7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP7");
                    }
                }
            });

            chap8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP8");
                    }
                }
            });

            chap9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP9");
                    }
                }
            });

            chap10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP10");
                    }
                }
            });

            chap11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP11");
                    }
                }
            });

            chap12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP12");
                    }
                }
            });

            chap13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP13");
                    }
                }
            });

            chap14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP14");
                    }
                }
            });

            chap15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP15");
                    }
                }
            });

            chap16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP16");
                    }
                }
            });

            chap17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP17");
                    }
                }
            });

            chap18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP18");
                    }
                }
            });

            chap19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP19");
                    }
                }
            });

            chap20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP20");
                    }
                }
            });

            chap21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP21");
                    }
                }
            });

            chap22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP22");
                    }
                }
            });

            chap23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP23");
                    }
                }
            });

            chap24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP24");
                    }
                }
            });

            chap25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/11/PHYSICS/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/11/CHEMISTRY/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/11/MAYHS/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/11/BIOLOGY/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/11/COMPUTER/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/11/ENGLISH/STUDY/CHAP25");
                    }
                }
            });
        }

//LINKING CHAPTERS OF STANDARD 12TH

        if(std.equals("12")) {
            chap1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP1");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP1");
                    }
                }
            });

            chap2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP2");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP2");
                    }
                }
            });

            chap3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP3");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP3");
                    }
                }
            });

            chap4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP4");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP4");
                    }
                }
            });

            chap5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP5");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP5");
                    }
                }
            });

            chap6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP6");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP6");
                    }
                }
            });

            chap7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP7");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP7");
                    }
                }
            });

            chap8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP8");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP8");
                    }
                }
            });

            chap9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP9");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP9");
                    }
                }
            });

            chap10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP10");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP10");
                    }
                }
            });

            chap11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP11");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP11");
                    }
                }
            });

            chap12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP12");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP12");
                    }
                }
            });

            chap13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP13");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP13");
                    }
                }
            });

            chap14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP14");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP14");
                    }
                }
            });

            chap15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP15");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP15");
                    }
                }
            });

            chap16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP16");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP16");
                    }
                }
            });

            chap17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP17");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP17");
                    }
                }
            });

            chap18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP18");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP18");
                    }
                }
            });

            chap19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP19");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP19");
                    }
                }
            });

            chap20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP20");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP20");
                    }
                }
            });

            chap21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP21");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP21");
                    }
                }
            });

            chap22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP22");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP22");
                    }
                }
            });

            chap23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP23");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP23");
                    }
                }
            });

            chap24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP24");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP24");
                    }
                }
            });

            chap25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (show.equals("GSEB" + " " + "Physics")) {
                        viewpdf("EXAM/GSEB/12/PHYSICS/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Chemistry")) {
                        viewpdf("EXAM/GSEB/12/CHEMISTRY/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Maths")) {
                        viewpdf("EXAM/GSEB/12/MAYHS/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Biology")) {
                        viewpdf("EXAM/GSEB/12/BIOLOGY/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "Computer")) {
                        viewpdf("EXAM/GSEB/12/COMPUTER/STUDY/CHAP25");
                    } else if (show.equals("GSEB" + " " + "English")) {
                        viewpdf("EXAM/GSEB/12/ENGLISH/STUDY/CHAP25");
                    }
                }
            });
        }
    }

    private void viewpdf(String path) {
        Intent intent = new Intent(StudyMaterial.this, ViewPDF.class);
        intent.putExtra("path","" + path);
        startActivity(intent);
    }
}