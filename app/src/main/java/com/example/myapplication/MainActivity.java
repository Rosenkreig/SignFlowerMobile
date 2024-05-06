package com.example.myapplication;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.Zodiac;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView imageViewAquarius = findViewById(R.id.imaquarius);
        imageViewAquarius.setImageResource(R.drawable.aquarius);

        ImageView imageViewAries = findViewById(R.id.imaries);
        imageViewAries.setImageResource(R.drawable.aries);

        ImageView imageViewCancer = findViewById(R.id.imcancer);
        imageViewCancer.setImageResource(R.drawable.cancer);

        ImageView imageViewCapricorn = findViewById(R.id.imcapricorn);
        imageViewCapricorn.setImageResource(R.drawable.capricorn);

        ImageView imageViewGemini = findViewById(R.id.imgemini);
        imageViewGemini.setImageResource(R.drawable.gemini);

        ImageView imageViewLeo = findViewById(R.id.imleo);
        imageViewLeo.setImageResource(R.drawable.leo);

        ImageView imageViewLibra = findViewById(R.id.imlibra);
        imageViewLibra.setImageResource(R.drawable.libra);

        ImageView imageViewPisces = findViewById(R.id.impisces);
        imageViewPisces.setImageResource(R.drawable.pisces);

        ImageView imageViewSaguttarius = findViewById(R.id.imsaguttarius);
        imageViewSaguttarius.setImageResource(R.drawable.saguttarius);

        ImageView imageViewScorpio = findViewById(R.id.imscorpio);
        imageViewScorpio.setImageResource(R.drawable.scorpio);

        ImageView imageViewTaurus = findViewById(R.id.imtaurus);
        imageViewTaurus.setImageResource(R.drawable.taurus);

        ImageView imageViewVirgo = findViewById(R.id.imvirgo);
        imageViewVirgo.setImageResource(R.drawable.virgo);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });


        findViewById(R.id.cancer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac cancer = new Zodiac("Cancer", R.drawable.cancer, "The coming month is likely to bring a mix of emotional depth and practical focus for Cancer. You may find yourself delving into matters of the heart, seeking deeper connections with loved ones and exploring your own feelings and desires. This introspective period can offer valuable insights into your emotional landscape and help you cultivate greater self-awareness. At the same time, there's a practical side to this month as well, with a focus on your career and financial matters. You may feel motivated to pursue your professional goals with renewed vigor, using your intuition and sensitivity to navigate challenges and seize opportunities. Remember to take care of your emotional well-being amidst your external pursuits, finding moments of quiet reflection and self-care to recharge and replenish your energy. Overall, this month holds the potential for meaningful growth and fulfillment for Cancer, both personally and professionally.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", cancer);
                startActivity(intent);
            }
        });
        findViewById(R.id.aquarius).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac aquarius = new Zodiac("Aquarius", R.drawable.aquarius, "The upcoming month could bring a mix of innovation and introspection for Aquarius. You might feel inspired to explore new ideas, engage in intellectual pursuits, or connect with like-minded individuals who share your unconventional outlook. Your natural curiosity and inventive spirit could lead you to exciting discoveries and breakthroughs, whether in your personal projects or collaborative ventures. However, amidst this outward exploration, it's essential to also honor your inner world. Take time for introspection and self-reflection, allowing yourself to process any emotions or insights that arise. Trust your intuition to guide you in making important decisions, and don't be afraid to embrace change and experimentation along the way. By balancing your innovative endeavors with moments of inner contemplation, you can make the most of the month ahead and experience personal growth on multiple levels.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", aquarius);
                startActivity(intent);
            }
        });
        findViewById(R.id.aries).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac aries = new Zodiac("Aries", R.drawable.aries, "The month ahead may bring a blend of excitement and introspection for Aries. You might find yourself propelled into new opportunities, especially in your career or personal projects. Your energy and enthusiasm will be high, driving you to pursue your goals with determination. However, it's important to balance this drive with moments of reflection. Take time to assess your priorities and ensure that you're aligned with your true passions. Don't hesitate to seek guidance from trusted friends or mentors if you find yourself at a crossroads. Overall, this period holds the potential for growth and self-discovery for Aries, as long as you remain open to both outer opportunities and inner insights.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", aries);
                startActivity(intent);
            }
        });
        findViewById(R.id.capricorn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac capricorn = new Zodiac("Capricorn", R.drawable.capricorn, "In the upcoming month, Capricorn may find themselves focusing on themes of responsibility, ambition, and long-term goals. You might feel a strong drive to advance in your career or pursue your aspirations with determination and discipline. This is a favorable time for setting concrete plans and taking practical steps towards your objectives. Your hard work and perseverance can lead to significant progress and recognition from others. However, it's important to also balance your professional pursuits with self-care and attention to your personal life. Don't neglect your relationships and well-being in the pursuit of success. Take time to nurture your connections with loved ones and prioritize activities that bring you joy and fulfillment outside of work. By maintaining this balance, you can make the most of the opportunities that come your way while also fostering a sense of harmony and contentment in all aspects of your life.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", capricorn);
                startActivity(intent);
            }
        });
        findViewById(R.id.gemini).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac gemini = new Zodiac("Gemini", R.drawable.gemini, "The month ahead holds the promise of new experiences and lively interactions for Gemini. You may find yourself drawn to social gatherings, intellectual pursuits, and spontaneous adventures that stimulate your curiosity and feed your need for variety. Your natural charm and wit can attract interesting people and opportunities into your life, making this a favorable time for networking and expanding your social circle. Additionally, you may feel inspired to pursue creative projects or explore new hobbies that allow you to express yourself freely. Embrace your versatility and adaptability, as they will serve you well in navigating the diverse opportunities and challenges that arise. Remember to stay open to new perspectives and ideas, as they could lead to exciting discoveries and personal growth. By embracing the spirit of exploration and remaining flexible in your approach, you can make the most of the month ahead and create memorable experiences that enrich your life.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", gemini);
                startActivity(intent);
            }
        });
        findViewById(R.id.leo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac leo = new Zodiac("Leo", R.drawable.leo, "The upcoming month holds the potential for both creativity and self-expression for Leo. You may feel a surge of confidence and vitality, inspiring you to pursue your passions and showcase your talents to the world. This is a favorable time for creative projects, performances, or any endeavor that allows you to shine brightly and captivate others with your unique flair. Your natural charisma and leadership abilities can also attract positive attention and opportunities for advancement in your personal and professional life. However, it's important to balance your desire for recognition with humility and authenticity. Take time to reflect on your values and intentions, and ensure that your actions are aligned with your true self. Remember to also nurture your relationships and support those around you in their endeavors. By channeling your creative energy into meaningful pursuits and maintaining a generous spirit, you can make the most of the month ahead and leave a lasting impression wherever you go.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", leo);
                startActivity(intent);
            }
        });
        findViewById(R.id.libra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac libra = new Zodiac("Libra", R.drawable.libra, "The month ahead may bring a harmonious blend of social connections and personal growth for Libra. You might find yourself surrounded by supportive friends and loved ones, enjoying meaningful conversations and shared experiences that deepen your bonds. This is a favorable time for collaboration and cooperation, whether in your personal relationships or professional endeavors. Your diplomatic skills and ability to see multiple perspectives can help you navigate any conflicts or challenges that arise with grace and ease. Additionally, you may feel inspired to focus on self-improvement and inner balance during this period. Take time for self-reflection, meditation, or other practices that nourish your mind, body, and spirit. By prioritizing your well-being and nurturing your relationships, you can create a sense of harmony and fulfillment that permeates all areas of your life. Trust in the power of love and connection to guide you towards greater happiness and success in the month ahead.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", libra);
                startActivity(intent);
            }
        });
        findViewById(R.id.pisces).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac pisces = new Zodiac("Pisces", R.drawable.pisces, "The upcoming month holds the promise of spiritual growth and emotional fulfillment for Pisces. You may find yourself drawn to activities and practices that nourish your soul, such as meditation, creative expression, or spending time in nature. This is a favorable time for introspection and self-discovery, as you delve deep into your subconscious mind and explore the hidden realms of your psyche. Trust your intuition to guide you in making decisions and navigating the twists and turns of life's journey. Additionally, your compassionate nature may lead you to seek ways to serve others and make a positive impact in your community. Whether through acts of kindness, volunteering, or lending a listening ear to those in need, your empathetic presence can bring comfort and healing to those around you.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", pisces);
                startActivity(intent);
            }
        });
        findViewById(R.id.saguttarius).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac saguttarius = new Zodiac("Saguttarius", R.drawable.saguttarius, "The month ahead may bring a sense of adventure and expansion for Sagittarius. You might feel a strong desire to break free from routine and explore new horizons, whether through travel, learning, or engaging in exciting experiences that broaden your perspective. Your optimistic outlook and thirst for knowledge can lead you to new discoveries and opportunities for personal growth. This is also a favorable time for philosophical reflection and spiritual exploration. You may find yourself questioning the deeper meaning of life and seeking answers to existential questions. Trust your intuition and inner wisdom to guide you on your journey of self-discovery. Additionally, your outgoing and adventurous nature can attract like-minded individuals into your life, leading to stimulating conversations and shared adventures. Embrace opportunities for social connection and collaboration, as they can lead to unexpected insights and friendships.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", saguttarius);
                startActivity(intent);
            }
        });
        findViewById(R.id.scorpio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac scorpio = new Zodiac("Scorpio", R.drawable.scorpio, "The month ahead may bring a mix of intensity and transformation for Scorpio. You might find yourself delving deep into your emotions and subconscious mind, uncovering hidden truths and insights that lead to profound personal growth. This is a favorable time for introspection and self-discovery, as you confront any fears or unresolved issues and emerge stronger and more resilient as a result. Your intuition and psychic abilities may be heightened during this period, allowing you to see beneath the surface and understand the motivations of others more clearly. Trust your instincts to guide you in making decisions and navigating complex situations. Additionally, this is a powerful time for letting go of anything that no longer serves your highest good. Whether it's unhealthy habits, toxic relationships, or outdated beliefs, releasing what no longer aligns with your authentic self can create space for new opportunities and experiences to enter your life.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", scorpio);
                startActivity(intent);
            }
        });
        findViewById(R.id.taurus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac taurus = new Zodiac("Taurus", R.drawable.taurus, "The upcoming month holds the potential for stability and growth for Taurus. You may find yourself focusing on practical matters such as finances, career advancement, and building a solid foundation for the future. Your determination and persistence can lead to tangible results, as you work steadily towards your goals with patience and dedication. This is also a favorable time for nurturing your relationships and creating a sense of security in your personal life. Take time to connect with loved ones, express your appreciation for their support, and strengthen the bonds that bring you comfort and joy. Additionally, you may feel drawn to activities that engage your senses and bring you pleasure, such as enjoying good food, music, or the beauty of nature. Cultivate moments of relaxation and indulgence amidst your busy schedule, allowing yourself to savor the simple pleasures of life.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", taurus);
                startActivity(intent);
            }
        });
        findViewById(R.id.virgo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zodiac virgo = new Zodiac("Virgo", R.drawable.virgo, "The month ahead holds the promise of productivity and self-improvement for Virgo. You may find yourself focusing on practical matters, such as organization, efficiency, and attention to detail. This is a favorable time for setting goals, creating plans, and taking concrete steps towards achieving your aspirations. Your analytical mind and problem-solving abilities can help you overcome any obstacles that arise with ease. Additionally, you may feel inspired to prioritize your health and well-being during this period. Establishing healthy routines, such as exercise, nutritious eating, and sufficient rest, can support your overall vitality and resilience. Pay attention to any signals your body sends you and make self-care a priority. This is also a favorable time for refining your skills and expanding your knowledge through study or training. Whether you're pursuing professional development opportunities or exploring new interests in your personal life, embrace the opportunity for growth and learning.\n\n");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_zodiac", virgo);
                startActivity(intent);
            }
        });
    }
}