package id.ajedkrap.staycation


class DataCity {
    private val aucklandCity = City(
        name = "Auckland",
        country = "New Zealand",
        currency = "NZD",
        largeImage = R.drawable.auckland_large,
        landmarks = DataLandmark.aucklandLandmarks,
        "25.00",
        "5.32",
        "14.00",
        "7.06",
        "3.21",
        "22.21",
        "1.77",
        "218.31",
        "85.34",
        "2,133.55",
        "4,414.80"
    )

    private val bangkokCity = City(
        name = "Bangkok",
        country = "Thailand",
        currency = "THB",
        largeImage = R.drawable.bangkok_large,
        landmarks = DataLandmark.bangkokLandmarks,
        "70.00",
        "69.22",
        "190.00",
        "66.69",
        "47.81",
        "422.78",
        "17.14",
        "2,380.13",
        "548.70",
        "19,192.18",
        "20,920.12"
    )

    private val bekasiCity = City(
        name = "Bekasi",
        country = "Indonesia",
        currency = "IDR",
        largeImage = R.drawable.bekasi_large,
        landmarks = DataLandmark.bekasiLandmarks,
        "30,000.00",
        "30,000.00",
        "50,000.00",
        "26,139.69",
        "12,657.14",
        "125,315.79",
        "6,625.00",
        "910,000.00",
        "484,166.67",
        "5,000,000.00",
        "8,233,333.33"
    )

    private val busanCity = City(
        name = "Busan",
        country = "South Korea",
        currency = "KRW",
        largeImage = R.drawable.busan_large,
        landmarks = DataLandmark.busanLandmarks,
        "7,500.00",
        "4,712.50",
        "6,500.00",
        "2,508.81",
        "5,000.00",
        "30,000.00",
        "1,325.00",
        "190,132.04",
        "33,714.29",
        "567,099.76",
        "2,468,598.59"
    )

    private val denpasarCity = City(
        name = "Denpasar",
        country = "Indonesia",
        currency = "IDR",
        largeImage = R.drawable.denpasar_large,
        landmarks = DataLandmark.denpasarLandmarks,
        "35,000.00",
        "29,204.62",
        "50,000.00",
        "19,275.00",
        "12,562.50",
        "136,666.67",
        "7,857.14",
        "876,041.67",
        "477,250.00",
        "3,071,428.57",
        "3,625,000.00"
    )

    private val jakartaCity = City(
        name = "Jakarta",
        country = "Indonesia",
        currency = "IDR",
        largeImage = R.drawable.jakarta_large,
        landmarks = DataLandmark.jakartaLandmarks,
        "35,000.00",
        "37,172.41",
        "50,000.00",
        "26,139.69",
        "13,318.52",
        "125,315.79",
        "7,270.83",
        "1,218,403.18",
        "463,947.37",
        "6,680,244.31",
        "7,702,500.00"
    )

    private val kualaLumpurCity = City(
        name = "Kuala Lumpur",
        country = "Malaysia",
        currency = "MYR",
        largeImage = R.drawable.kl_large,
        landmarks = DataLandmark.kualaLumpurLandmarks,
        "12.00",
        "11.63",
        "18.00",
        "6.65",
        "6.58",
        "36.41",
        "2.57",
        "214.43",
        "107.92",
        "1,811.62",
        "5,120.40"
    )

    private val osakaCity = City(
        name = "Osaka",
        country = "Japan",
        currency = "JPY",
        largeImage = R.drawable.osaka_large,
        landmarks = DataLandmark.osakaLandmarks,
        "916.57",
        "356.67",
        "687.60",
        "252.17",
        "528.33",
        "2,583.33",
        "127.50",
        "19,849.24",
        "4,062.50",
        "108,857.14",
        "323,765.25"
    )

    private val seoulCity = City(
        name = "Seoul",
        country = "South Korea",
        currency = "KRW",
        largeImage = R.drawable.seoul_large,
        landmarks = DataLandmark.seoulLandmarks,
        "9,000.00",
        "4,989.49",
        "7,000.00",
        "4,717.18",
        "4,845.43",
        "54,906.78",
        "1,464.71",
        "227,555.56",
        "27,030.77",
        "1,026,238.62",
        "3,458,158.38",
    )

    private val sydneyCity = City(
        name = "Sydney",
        country = "Australia",
        currency = "AUD",
        largeImage = R.drawable.sydney_large,
        landmarks = DataLandmark.sydneyLandmarks,
        "20.00",
        "4.42",
        "12.57",
        "4.89",
        "2.72",
        "19.31",
        "2.37",
        "198.99",
        "72.70",
        "2,545.89",
        "6,939.21"
    )

    private val tokyoCity = City(
        name = "Tokyo",
        country = "Japan",
        currency = "JPY",
        largeImage = R.drawable.tokyo_large,
        landmarks = DataLandmark.tokyoLandmarks,
        "1,000.00",
        "479.58",
        "700.00",
        "249.73",
        "473.62",
        "3,399.23",
        "141.59",
        "23,035.12",
        "4,800.81",
        "1,279,524.51",
        "388,364.01"
    )

    fun getCities(): ArrayList<City> {
        return arrayListOf(
            aucklandCity,
            bangkokCity,
            bekasiCity,
            busanCity,
            denpasarCity,
            jakartaCity,
            kualaLumpurCity,
            osakaCity,
            seoulCity,
            sydneyCity,
            tokyoCity
        )
    }
}