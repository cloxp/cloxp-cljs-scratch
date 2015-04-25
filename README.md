# cloxp live cljs development

The setup is still a bit fiddly, it will get easier soon.

For now here are the steps to get a live cljs workspace going:

1. Make sure your `LivelyKernel/PartsBin/Clojure` folder contains the parts from https://github.com/cloxp/cloxp-install/tree/pre-0.0.8/PartsBin/Clojure

2. Make sure your LivelyKernel repo is of revision cloxp-pre-0.0.8 (https://github.com/cloxp/LivelyKernel/tree/cloxp-pre-0.0.8)

3. Run those commands in a Shell workspace:

```sh
cd! $WORKSPACE_LK;
git clone https://github.com/cloxp/cloxp-cljs-scratch;
cd! $WORKSPACE_LK/cloxp-cljs-scratch;
```

4. Open a ClojureScript browser, choose more... -> load project... and make sure that the `rksm.cljs-workspace-test` namespace gets loaded.

5. Inside the ClojureScript browser save the `rksm.cljs-workspace-test` (Command-s). This will compile cljs -> js

6. Open a Clojure workspace and evaluate

```clojure
(require '[rksm.cloxp-com.server :as server])
(server/start-server! :port 8084)
```

7. Visit http://localhost:8084/test-page.html. The page should load.

8. Open a ClojureScript workspace (`$world.openPartItem("ClojureScriptWorkspace", "PartsBin/Clojure");`). You should be able to connect to the test page
