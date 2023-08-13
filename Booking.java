package com.example.moviebookingapp;


    private class MyAdapter extends Booking {

        ListView simpleList;
        String countryList[] = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6"};


        // override other abstract methods here

        @Override
        public View getView(int position, View convertView, ViewGroup container) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_item, container, false);
            }

            ((TextView) convertView.findViewById(android.R.id.text1))
                    .setText(getItem(position));
            return convertView;
        }
    }
}
