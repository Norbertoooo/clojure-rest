(ns clojure-rest.db
  (:use korma.db))

  (defdb db (mysql {:classname "com.mysql.jdbc.Driver"
                    :subprotocol "mysql"
                    :subname "//localhost/clojure-rest"
                    :user "root"
                    :password "password"}))
