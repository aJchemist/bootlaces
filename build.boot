(set-env!
  :resource-paths #{"src"}
  :dependencies '[[org.clojure/clojure "1.6.0"     :scope "provided"]
                  [boot/core           "2.0.0-rc2" :scope "provided"]])

(require '[boot.git :refer [last-commit]]
         '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.7")

(bootlaces! +version+)

(task-options!
  pom  {:project        'adzerk/bootlaces
        :version        +version+
        :description    "Adzerk's boot configurations for Clojure libraries "
        :url            "https://github.com/adzerk/bootlaces"
        :scm            {:url "https://github.com/adzerk/bootlaces"}
        :license        {:name "Eclipse Public License"
                         :url  "http://www.eclipse.org/legal/epl-v10.html"}})
