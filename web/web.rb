require "erb"
require "sinatra"

get "/:name" do
    template = "<h1>Hello <%= name %></h1>"
    layout = "<html><body><%= yield %></body></html>"

    erb template, { :locals => params, :layout => layout }
end