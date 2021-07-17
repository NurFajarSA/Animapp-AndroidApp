package com.nfroject.animapp

object AnimappData {
    private val img = intArrayOf(R.drawable.albino_python,
    R.drawable.arapaima,
    R.drawable.blue_peacock,
    R.drawable.jaguar,
    R.drawable.komodo,
    R.drawable.pelican,
    R.drawable.salvator_lizard,
    R.drawable.sambar_deer,
    R.drawable.white_tiger,
    R.drawable.yellow_cockatoo)

    private val name = arrayOf("Albino Python",
    "Arapaima",
    "Blue Peacock",
    "Jaguar",
    "Komodo",
    "Pelican",
    "Salvator Lizard",
    "Sambar Deer",
    "White Tiger",
    "Yellow-Crested\nCockatoo"
    )

    private val className = arrayOf("REPTILIA",
    "PISCES",
    "AVES",
    "MAMMALIA",
    "REPTILIA",
    "AVES",
    "REPTILIA",
    "MAMMALIA",
    "MAMMALIA",
    "AVES")

    private val ordeName = arrayOf("SQUAMATA",
    "OSTEOLOGOSSI",
    "GALLLIFORMES",
    "CARNIVORA",
    "SQUAMATA",
    "PELICANNI",
    "SQUAMATA",
    "ARTIODACTYLA",
    "CARNIVORA",
    "ARTIODACTYLA")

    private val familyName = arrayOf("BIODAE",
    "OSTEOLOGOSSIDAE",
    "OSTEOLOGOSSIDAE",
    "FELIDAE",
    "VARANIDAE",
    "PELICANIDAE",
    "VARANIDAE",
    "CARVIDAE",
    "FELIDAE",
    "CACATUIDAE")

    private val overview = arrayOf("Albino Python is one of the five largest snakes in the world, native to a large variation of tropic and subtropic areas of Southern- and Southeast Asia. They are often found near water and are sometimes semi-aquatic, but can also be found in trees.",
    "Arapaima (genus: Arapaima gigas) is a genus of bonytongues native to the Amazon and Essequibobasins of South America. They are among the largest freshwater fish in the world, reaching lengths of as much as 4.5m (15 ft).",
    "The Indian peafowl or blue peafowl (Pavo cristatus) is a large and brightly coloured bird of the pheasant family native to South Asia, but introduced in many other parts of the world like the United States, Mexico, Honduras, etc.",
    "The Jaguar or Panthera onca, is a big cat, a feline in the Panthera genus, and is the only Panthera species found in the Americas. The jaguar is the third-largest feline after the tiger and the lion, and the largest in the Western Hemisphere.",
    "Komodo is a large species of lizard found in the Indonesian islands of Komodo, Rinca, Flores, Gili Motang, and Padar. A member of the monitor lizard family (Varanidae), it is the largest living species of lizard, growing to a maximum length of 3 metres (10 ft) in rare cases and weighing up to approximately 70 kilograms.",
    "Pelicans (Pelecanus onocrotalus) are a genus of large water birds that makes up the family Pelecanidae. They are characterised by a long beak and a large throat pouch used for catching prey and draining water from the scooped up contents before swallowing.",
    "Salvator Lizard (Varanus salvator) is a large lizard native to South and Southeast Asia. Water monitors are one of the most common monitor lizards found throughout Asia, and range from Bangladesh, Sri Lanka and India to Indochina, the Malay Peninsula, and various islands of Indonesia, living in areas close to water.",
    "Sambar deer is a large deer native to the Indian Subcontinent, southern China and Southeast Asia. Although it primarily refers to R. unicolor, the name “sambar” is also sometimes used to refer to the Philippine deer (called the Philippine sambar) and the rusa deer (called the Sunda sambar).",
    "The Bengal tiger (Panthera tigris tigris) is the most numerous tiger subspecies. Its populations have been estimated at 1,706–1,909 in India, 440 in Bangladesh, 163–253 in Nepal and 67–81 in Bhutan.",
    "The sulphur-crested cockatoo (Cacatua galerita) is a relatively large white cockatoo found in wooded habitats in Australia and New Guinea and some of the islands of Indonesia. They can be locally very numerous, leading to them sometimes being considered pests.",)

    private val reproduction = arrayOf("Females lay 30-50 grains, eggs incubated above the ground with a long incubation period of between 60-90 days. Children with newly hatched 60-70 cm long. Long life 40-50 years.",
    "South America.",
    "Male peacock has more than one spouse (polygamy). In the breeding season. Female birds usually incubate three to six eggs.",
    "Adult Sex 3-4 years, long gestation between 100-110 days, usually spawned 1-3 tails, with mother until age 1-2 years.",
    "Gestation length between 7–8 months, usually 1 whole child birth.",
    "Mating takes place immediately after getting the couple and continued for 3 to 10 days before the egg is removed.",
    "Laying, incubation period 168-171 days.",
    "Gestation length between 7-8 months, usually give birth first pups.",
    "Males reach maturity at 4–5 years of age, and females at 3–4 years. Gestation period of 104–106 days, 1–4 cubs are born.",
    "1 egg laying, incubation period of 30-35 days, young leave the nest 3 weeks of age.")

    private val information = arrayOf("https://ragunanzoo.jakarta.go.id/ragunan-animals/reptilia/python-albino/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/reptilia/python-albino/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/aves-en/merak-biru-2/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/mamalia-en/jaguar/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/reptilia/komodo/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/aves-en/pelikan/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/reptilia/lizard-salvator/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/mamalia-en/sambar-deer/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/mamalia-en/white-tiger-2/",
    "https://ragunanzoo.jakarta.go.id/ragunan-animals/aves-en/kakatua-jambul-kuning/")

    val listData: ArrayList<Animapp>
        get() {
            val list = arrayListOf<Animapp>()
            for (position in name.indices){
                val animapp = Animapp()
                animapp.img = img[position]
                animapp.name = name[position]
                animapp.className = className[position]
                animapp.ordeName = ordeName[position]
                animapp.familyName = familyName[position]
                animapp.overview = overview[position]
                animapp.reproduction = reproduction[position]
                animapp.information = information[position]
                list.add(animapp)
            }
            return list
        }
}
