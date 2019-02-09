//'http://groovy-lang.org/index.html'.toURL().text

//'https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyDzk3gcgXbhjx3hMP7IYIo4KaBdNOouQBs'.toURL().text

apiEndPoint = 'https://maps.googleapis.com/maps/api/geocode/json?address='
apiKey = '&key=ADD_API_KEY_HERE'

def address = ['10 Fawcett Street', 'cambridge', 'MA']
def encoded = address.collect { line -> line.split().join('+') }
                     .join(',+')

apiURL = apiEndPoint + encoded + apiKey
apiURL.toURL().text

