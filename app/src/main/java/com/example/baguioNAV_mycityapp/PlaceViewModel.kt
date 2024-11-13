package com.example.baguioNAV_mycityapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    fun loadPlaces(category: String) {
        _places.value = when (category) {
            "Cafe" -> listOf(
                Place("Cafe Yagam",
                    "A quaint cafe that focuses on traditional Cordilleran cuisine in a cozy house setting.\n\n" +
                            "Address: 22 Upper Magsaysay Ave, Baguio City\n\n" +
                            "Price Range: ₱100 - ₱300\n\n" +
                            "Ambiance: Peaceful, homey vibe with warm interiors.\n\n" +
                            "What Makes It Underrated: Located off the main roads, it showcases local culture through its food and ambiance.",
                    R.drawable.cafe_yagam
                ),
                Place("Hatch Coffee",
                    "Minimalist and modern, perfect for coffee enthusiasts and creatives looking for a quiet spot.\n\n" +
                            "Address: 75 Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱100 - ₱250\n\n" +
                            "Ambiance: Clean, minimalistic design with a calm atmosphere popular among students.\n\n" +
                            "What Makes It Underrated: Tucked away on a quieter part of Session Road, it's a hidden gem for specialty coffee lovers.",
                    R.drawable.hatchcoffee
                ),
                Place("Il-lengan Cafe",
                    "A serene, outdoor cafe set amidst nature in Itogon, offering an escape from the city’s hustle.\n\n" +
                            "Address: Itogon, Baguio City (short drive from the city center)\n\n" +
                            "Price Range: ₱100 - ₱200\n\n" +
                            "Ambiance: Quiet outdoor setting with mountain views and fresh air.\n\n" +
                            "What Makes It Underrated: Just a short drive from Baguio, it offers a peaceful, scenic ambiance rarely found in the city center.",
                    R.drawable.illengan
                ),
                Place("Kaffeeklatsch",
                    "A cozy coffee shop with a unique artsy interior, frequented by locals and artists alike.\n\n" +
                            "Address: T. Alonzo Street, Baguio City\n\n" +
                            "Price Range: ₱120 - ₱350\n\n" +
                            "Ambiance: Eclectic and artsy, with a cozy, welcoming feel.\n\n" +
                            "What Makes It Underrated: Known for hosting live music and art events, making it a vibrant spot for creative souls.",
                    R.drawable.kaffeeklatsch
                ),
                Place("The Other Office Cafe",
                    "An intimate spot with a library-like atmosphere, ideal for quiet coffee sessions or work.\n\n" +
                            "Address: South Drive, Baguio City\n\n" +
                            "Price Range: ₱150 - ₱400\n\n" +
                            "Ambiance: Book-filled shelves and warm lighting create a relaxed, studious ambiance.\n\n" +
                            "What Makes It Underrated: Tucked away from tourist areas, it's favored by locals looking for a quiet workspace.",
                    R.drawable.the_other_office_cafe
                ),
                Place("Patches Café",
                    "A small cafe with unique decor, known for its personalized service and community feel.\n\n" +
                            "Address: 7 Leonard Wood Road, Baguio City\n\n" +
                            "Price Range: ₱80 - ₱250\n\n" +
                            "Ambiance: Cozy, community-focused atmosphere with rustic, handcrafted interiors.\n\n" +
                            "What Makes It Underrated: It’s a hidden gem where the owners often engage with customers, making it feel like a home.",
                    R.drawable.patches_cafe
                ),
                Place("Vanilla Cafe",
                    "Charming and small, this cafe offers a European-inspired interior with a romantic vibe.\n\n" +
                            "Address: 26 Outlook Drive, Baguio City\n\n" +
                            "Price Range: ₱100 - ₱300\n\n" +
                            "Ambiance: Charming and quaint, with vintage decor and an intimate feel.\n\n" +
                            "What Makes It Underrated: Located outside the busy city center, it's a quiet escape with a distinct ambiance.",
                    R.drawable.vanilla_cafe
                ),
                Place("Ili-Likha Artists' Village",
                    "An artist’s haven designed by Baguio artist Kidlat Tahimik, with various mini cafes.\n\n" +
                            "Address: Assumption Road, Baguio City\n\n" +
                            "Price Range: ₱100 - ₱300\n\n" +
                            "Ambiance: Art-filled and quirky, with unique, locally inspired architecture.\n\n" +
                            "What Makes It Underrated: It’s a cultural spot few tourists know about, offering local art, food, and atmosphere.",
                    R.drawable.ili_likha
                )
            )


            "Restaurants" -> listOf(
                Place("Good Taste",
                    "Known for its affordable yet generous servings, this casual eatery is a favorite among locals and tourists.\n\n" +
                            "Address: 69, Lower General Luna Road, Baguio City\n\n" +
                            "Price Range: ₱100 - ₱300\n\n" +
                            "Ambiance: Simple, bustling, and family-friendly.\n\n" +
                            "What Makes It Underrated: Despite its popularity, it remains humble and affordable, offering large portions at low prices.",
                    R.drawable.good_taste
                ),
                Place("The Hill Station",
                    "A cozy spot highlighting both local and international flavors with a vintage decor that adds a charming touch.\n\n" +
                            "Address: 14 Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱300 - ₱1,200\n\n" +
                            "Ambiance: Elegant and rustic, with warm lighting and wooden interiors.\n\n" +
                            "What Makes It Underrated: Its higher price range deters some tourists, but the quality and ambiance are worth the splurge.",
                    R.drawable.hillstation
                ),
                Place("The Forest House",
                    "Set among Baguio’s pine trees, this restaurant offers a mix of Filipino and Western dishes with mountain views.\n\n" +
                            "Address: 36-38 Outlook Ridge, Baguio City\n\n" +
                            "Price Range: ₱250 - ₱800\n\n" +
                            "Ambiance: Rustic and peaceful, with a cozy, cabin-like feel.\n\n" +
                            "What Makes It Underrated: Located slightly off the main path, it’s a hidden gem for those seeking a quiet meal in nature.",
                    R.drawable.foresthouse
                ),
                Place("The Red Lion",
                    "A pub-style restaurant known for its comfort food, extensive drink selection, and laid-back vibe.\n\n" +
                            "Address: 2, Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱200 - ₱600\n\n" +
                            "Ambiance: Casual and warm, with a cozy pub feel.\n\n" +
                            "What Makes It Underrated: Known mostly to locals, it’s a great spot for socializing with happy hour deals and live music events.",
                    R.drawable.redlion
                ),
                Place("Raff's Fried Chicken House",
                    "A beloved spot for roasted and fried chicken served with traditional Filipino side dishes.\n\n" +
                            "Address: Military Cut-Off Road, Baguio City\n\n" +
                            "Price Range: ₱150 - ₱400\n\n" +
                            "Ambiance: Casual, no-frills setting with family-friendly service.\n\n" +
                            "What Makes It Underrated: Tucked away from the main tourist areas, this place is known for its flavorful chicken at affordable prices.",
                    R.drawable.raffs
                ),
                Place("Alfresco Restaurant",
                    "An open-air dining experience surrounded by nature, offering a mix of local and international cuisine.\n\n" +
                            "Address: 72, Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱200 - ₱500\n\n" +
                            "Ambiance: Relaxing outdoor atmosphere, ideal for family gatherings.\n\n" +
                            "What Makes It Underrated: Located slightly away from the city’s center, it’s a perfect spot for a peaceful meal in a natural setting.",
                    R.drawable.alfresco
                ),
                Place("Ganza Restaurant",
                    "Offers hearty Filipino and Asian cuisine with a family-friendly setting.\n\n" +
                            "Address: 25, 27 Upper General Luna Road, Baguio City\n\n" +
                            "Price Range: ₱150 - ₱450\n\n" +
                            "Ambiance: Cozy and casual, with a welcoming atmosphere.\n\n" +
                            "What Makes It Underrated: Though centrally located, it’s often overlooked in favor of more touristy spots.",
                    R.drawable.ganza
                ),
                Place("Sizzling Plate",
                    "Known for its sizzling hot plate dishes, from steaks to sisig, providing a unique dining experience.\n\n" +
                            "Address: 23, Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱200 - ₱500\n\n" +
                            "Ambiance: Casual and lively, with the sound and aroma of sizzling dishes.\n\n" +
                            "What Makes It Underrated: A long-time favorite with a simple setup, but offers great value for its signature sizzling plates.",
                    R.drawable.sizzling
                ),
                Place("Mangan Tayo",
                    "A cozy spot offering traditional Filipino dishes with a home-cooked feel.\n\n" +
                            "Address: 4, Lower Gen. Luna Road, Baguio City\n\n" +
                            "Price Range: ₱150 - ₱400\n\n" +
                            "Ambiance: Warm and inviting, with a focus on Filipino hospitality.\n\n" +
                            "What Makes It Underrated: Popular among locals but not widely known to tourists, offering authentic flavors in a homey setting.",
                    R.drawable.mangantayo
                ),
                Place("Tito’s Grill",
                    "A local favorite for grilled Filipino specialties, offering a relaxed atmosphere perfect for group dining.\n\n" +
                            "Address: 56, Upper Session Road, Baguio City\n\n" +
                            "Price Range: ₱150 - ₱400\n\n" +
                            "Ambiance: Casual and laid-back, with a focus on Filipino comfort food.\n\n" +
                            "What Makes It Underrated: Known mostly by locals, it’s a solid choice for traditional grilled dishes with generous portions.",
                    R.drawable.titos
                ),
            )

            "Malls" -> listOf(
                Place("SM City Baguio",
                    "The largest shopping mall in Baguio City, offering a wide selection of stores, restaurants, and entertainment options, along with a beautiful view of the city and surrounding mountains.\n\n" +
                            "Address: Luneta Hill, Upper Session Road, Baguio City, Benguet\n\n" +
                            "Features: Department store, cinemas, food court, outdoor terrace, and panoramic views.",
                    R.drawable.sm_baguio
                ),
                Place("Abanao Square",
                    "A compact mall located near Burnham Park, with a good variety of shops, dining options, and services. It’s a convenient stop for locals and tourists looking for essentials.\n\n" +
                            "Address: Abanao St, Baguio City, Benguet\n\n" +
                            "Features: Retail stores, fast food outlets, grocery store, and basic amenities.",
                    R.drawable.abanao_square
                ),
                Place("Cedar Peak Mall",
                    "A smaller mall that houses several unique stores and local restaurants, providing a quieter shopping experience near Baguio City Public Market.\n\n" +
                            "Address: Mabini St, Baguio City, Benguet\n\n" +
                            "Features: Specialty shops, local dining, supermarket, and service centers.",
                    R.drawable.cedar_peak
                ),
                Place("Porta Vaga Mall",
                    "A well-known shopping complex on Session Road with a mix of fashion stores, bookstores, cafes, and more. A great spot to enjoy the local shopping scene.\n\n" +
                            "Address: Session Road, Baguio City, Benguet\n\n" +
                            "Features: Fashion boutiques, specialty stores, cafes, and bookshops.",
                    R.drawable.porta_vaga
                ),
                Place("Maharlika Livelihood Complex",
                    "A unique shopping area where you can find locally made crafts, souvenirs, and traditional Cordilleran products. Perfect for those looking to take home a piece of Baguio culture.\n\n" +
                            "Address: Magsaysay Ave, Baguio City, Benguet\n\n" +
                            "Features: Souvenir shops, handicrafts, thrift stores, and local products.",
                    R.drawable.maharlika
                ),
                Place("Baguio Center Mall",
                    "Located in the city center, this mall offers a range of stores, affordable eateries, and basic services. It’s popular with locals for its accessible location and budget-friendly options.\n\n" +
                            "Address: Magsaysay Ave, Baguio City, Benguet\n\n" +
                            "Features: Supermarket, food stalls, affordable retail stores, and services.",
                    R.drawable.center_mall
                ),
                Place("La Trinidad Public Market and Mall",
                    "Located in La Trinidad, this mall and market combination is ideal for those looking to experience the local culture. It features fresh produce, local products, and shops.\n\n" +
                            "Address: Km 5, La Trinidad, Benguet\n\n" +
                            "Features: Fresh produce market, local retail, and regional products.\n\n" +
                            "What Makes It Special: A bustling hub for local goods and produce just outside Baguio City.",
                    R.drawable.la_trinidad_market
                ),
                Place("Skyworld Commercial Center",
                    "An older shopping arcade along Session Road with affordable stalls and shops offering clothing, accessories, and quick bites. It has a nostalgic appeal for long-time Baguio visitors.\n\n" +
                            "Address: Session Road, Baguio City, Benguet\n\n" +
                            "Features: Bargain stalls, accessories, clothing, and small eateries.\n\n" +
                            "What Makes It Special: A budget-friendly spot with a classic Baguio vibe.",
                    R.drawable.skyworld
                ),
                Place("Ili-Likha Artists Village",
                    "A unique arts and dining hub that combines local cuisine and artisan crafts. Built by acclaimed filmmaker Kidlat Tahimik, it's a cultural gem with a quirky, eco-friendly design.\n\n" +
                            "Address: Assumption Road, Baguio City, Benguet\n\n" +
                            "Features: Local food stalls, artisan shops, and eco-friendly spaces.\n\n" +
                            "What Makes It Special: Offers an artsy, local atmosphere for dining and shopping in a one-of-a-kind setting.",
                    R.drawable.ili_likha
                ),
                Place("Supermarket at Baguio Public Market",
                    "Not a mall per se, but an essential part of the Baguio shopping experience. Known for its wide selection of fresh produce, coffee beans, souvenirs, and local treats.\n\n" +
                            "Address: Magsaysay Ave, Baguio City, Benguet\n\n" +
                            "Features: Fresh produce, coffee beans, souvenirs, and local delicacies.\n\n" +
                            "What Makes It Special: A must-visit for anyone looking to experience the true flavors of Baguio.",
                    R.drawable.baguio_market
                ),
            )


            "Parks" -> listOf(
                Place("Wright Park",
                    "Known for its scenic pool of pines and pony rides, Wright Park is a favorite spot for kids to experience horseback riding and enjoy the fresh mountain air.\n\n" +
                            "Address: Gibraltar Road, Baguio City, Benguet\n\n" +
                            "Activities: Horseback riding, taking photos by the pool of pines, and relaxing walks along pine-lined paths.",
                    R.drawable.wright_park
                ),
                Place("Centennial Park",
                    "Centennial Park is a lesser-known natural spot, perfect for quiet family picnics and scenic walks. It’s a tranquil place where kids can safely explore nature.\n\n" +
                            "Address: Outlook Drive, Baguio City, Benguet\n\n" +
                            "Activities: Picnicking, nature walks, bird watching, and enjoying mountain views.",
                    R.drawable.centennial_park
                ),
                Place("Yellow Trail at Camp John Hay",
                    "The Yellow Trail offers an easy hiking path through pine forests, giving kids a chance to enjoy a peaceful walk surrounded by nature.\n\n" +
                            "Address: Camp John Hay, Loakan Road, Baguio City, Benguet\n\n" +
                            "Activities: Hiking, nature observation, and exploring flora and fauna on a family-friendly trail.",
                    R.drawable.yellow_trail
                ),
                Place("Grotto of Our Lady of Lourdes",
                    "A unique spot combining nature and culture, the grotto offers a staircase hike where kids can count steps on the way up. At the top, enjoy views and the peaceful surroundings.\n\n" +
                            "Address: Dominican Hill Road, Baguio City, Benguet\n\n" +
                            "Activities: Climbing steps, scenic views, and visiting the grotto shrine.",
                    R.drawable.grotto
                ),
                Place("Philippine Military Academy (PMA) Grounds",
                    "The PMA grounds offer a spacious area with vintage military tanks and airplanes, making it both educational and fun for children.\n\n" +
                            "Address: Fort Del Pilar, Baguio City, Benguet\n\n" +
                            "Activities: Exploring tanks and planes, walking tours, and observing cadet drills.",
                    R.drawable.pma
                ),
                Place("Peace Memorial Park",
                    "A serene spot ideal for family walks, Peace Memorial Park is a quiet escape with gardens, statues, and historical memorials that kids can learn about.\n\n" +
                            "Address: South Drive, Baguio City, Benguet\n\n" +
                            "Activities: Sightseeing, quiet walks, and exploring historical monuments.",
                    R.drawable.peace_memorial
                ),
                Place("La Trinidad Strawberry Fields",
                    "A short drive from Baguio, this farm lets kids pick their own strawberries and enjoy farm life. It's a popular, hands-on experience for families.\n\n" +
                            "Address: La Trinidad, Benguet\n\n" +
                            "Activities: Strawberry picking, farm tours, and sampling fresh produce.",
                    R.drawable.strawberry_farm
                ),
                Place("Heritage Hill and Nature Park Garden (Diplomat Hotel)",
                    "Located at the old Diplomat Hotel ruins, this spot combines historical architecture with gardens, offering a spooky-yet-fun experience for older kids.\n\n" +
                            "Address: Dominican Hill, Baguio City, Benguet\n\n" +
                            "Activities: Exploring ruins, walking through gardens, and historical learning.",
                    R.drawable.diplomat_hotel
                ),
                Place("Ketchup Food Community",
                    "While not a traditional park, this unique outdoor dining area surrounded by greenery offers family-friendly local food and a playful atmosphere for kids.\n\n" +
                            "Address: Romulo Drive, Baguio City, Benguet\n\n" +
                            "Activities: Outdoor dining, enjoying local dishes, and playing in the open area.",
                    R.drawable.ketchup_food_community
                ),
                Place("Panagbenga Park",
                    "This floral-themed park is a colorful space with flower beds and landscaping, ideal for families looking to enjoy Baguio’s flowers year-round.\n\n" +
                            "Address: Upper Session Road, Baguio City, Benguet\n\n" +
                            "Activities: Flower viewing, walking trails, and picnicking.",
                    R.drawable.panagbenga_park
                ),
            )

            "Museums" -> listOf(
                Place("BenCab Museum",
                    "Founded by National Artist Benedicto Cabrera, this museum showcases contemporary Philippine art alongside indigenous artifacts. Kids will enjoy the beautiful garden, duck pond, and mini waterfall outside.\n\n" +
                            "Address: Km 6 Asin Road, Tuba, Benguet\n\n" +
                            "Highlights: Contemporary art galleries, Cordillera artifacts, and an eco-trail with scenic views.",
                    R.drawable.bencab_museum
                ),
                Place("Baguio Museum",
                    "This museum focuses on the rich history and cultural heritage of the Cordillera region. Kids can explore exhibits featuring traditional clothing, tools, and artifacts from various indigenous groups.\n\n" +
                            "Address: DOT-PTA Complex, Gov. Pack Road, Baguio City, Benguet\n\n" +
                            "Highlights: Ethnographic exhibits, Cordilleran history, and cultural artifacts.",
                    R.drawable.baguio_museum
                ),
                Place("Museo Kordilyera",
                    "Located within UP Baguio, this museum is dedicated to Cordilleran anthropology. It offers interactive exhibits that make learning about indigenous practices engaging for kids.\n\n" +
                            "Address: University of the Philippines Baguio, Gov. Pack Road, Baguio City, Benguet\n\n" +
                            "Highlights: Anthropological exhibits, traditional artifacts, and interactive displays on Cordilleran culture.",
                    R.drawable.museo_kordilyera
                ),
                Place("Emilio Aguinaldo Museum",
                    "This museum is home to one of the earliest Philippine flags used during the declaration of independence in 1898. It's a small museum but rich in historical significance.\n\n" +
                            "Address: Happy Glen Loop, Baguio City, Benguet\n\n" +
                            "Highlights: Historic Philippine flag, exhibits on Philippine independence, and memorabilia of Emilio Aguinaldo.",
                    R.drawable.aguinaldo_museum
                ),
                Place("Bell House Museum",
                    "Situated in Camp John Hay, this museum was once the residence of American military officials. It’s a great spot for families interested in American colonial history in Baguio.\n\n" +
                            "Address: Camp John Hay, Loakan Road, Baguio City, Benguet\n\n" +
                            "Highlights: Colonial-era artifacts, historical furniture, and guided tours.",
                    R.drawable.bell_house
                ),
                Place("Tam-awan Village",
                    "This cultural village recreates traditional Cordilleran homes and offers an immersive experience in local arts. Kids can explore huts, art workshops, and meet local artists.\n\n" +
                            "Address: 366-C Pinsao Proper, Baguio City, Benguet\n\n" +
                            "Highlights: Traditional huts, art galleries, and hands-on art workshops.",
                    R.drawable.tamawan
                ),
                Place("Ifugao Woodcarvers' Village",
                    "Though not a formal museum, this area along Asin Road showcases the work of local woodcarvers. Families can observe traditional carving techniques and buy unique souvenirs.\n\n" +
                            "Address: Asin Road, Tuba, Benguet\n\n" +
                            "Highlights: Woodcarving demonstrations, local handicrafts, and an outdoor cultural experience.",
                    R.drawable.woodcarvers_village
                ),
                Place("Diplomat Hotel Ruins",
                    "This abandoned structure with a haunting past is a mix of history and mystery. Kids might enjoy exploring the old rooms and imagining its storied past, though some may find it spooky.\n\n" +
                            "Address: Dominican Hill Road, Baguio City, Benguet\n\n" +
                            "Highlights: Historic ruins, scenic views, and a unique blend of history and intrigue.",
                    R.drawable.diplomat_hotel
                ),
                Place("Laperal White House",
                    "Known as one of Baguio's most haunted houses, the Laperal White House is also a museum showcasing bamboo and woodcraft. Perfect for families who enjoy both art and a touch of mystery.\n\n" +
                            "Address: Leonard Wood Road, Baguio City, Benguet\n\n" +
                            "Highlights: Bamboo and woodcraft exhibits, haunted house lore, and historical architecture.",
                    R.drawable.laperal_house
                ),
                Place("Arko ni Apo",
                    "This unique gallery and workshop is home to renowned sculptor Benhur Villanueva. Kids and families can see various sculptures and get a glimpse into the creative process.\n\n" +
                            "Address: Ambuklao Road, Baguio City, Benguet\n\n" +
                            "Highlights: Outdoor sculptures, art workshops, and meeting local artists.",
                    R.drawable.arko_ni_apo
                ),
            )
            else -> emptyList()
        }
    }
}