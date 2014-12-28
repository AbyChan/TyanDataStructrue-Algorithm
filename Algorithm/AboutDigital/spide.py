# coding=gbk

import urllib2, re, codecs

from bs4 import BeautifulSoup



def parseItemAttr(item_dom):

        item_attr = {}

        # get title

        tmp_a = item_dom.find("h3",class_='summary').find('a')

        item_attr['title'] = tmp_a.get('title')

        item_attr['href'] = tmp_a.get('href')

        item_attr['price'] = item_dom.find('div', class_="price").text

        item_attr['dealing'] = item_dom.find('div', class_="dealing").text

        

        tmp = item_dom.find('div', class_="count")

        if tmp is not None:

                item_attr['count'] = tmp.text

        else:

                item_attr['count'] = ''

        return item_attr



# taobao, search [ipad], sort by [sale-desc]

tb_search_result_html = urllib2.urlopen('http://s.taobao.com/search?spm=a230r.1.8.3.3si55P&promote=0&sort=sale-desc&initiative_id=tbindexz_20140222&tab=all&q=%D0%A1%C3%D7#J_relative').read()



# beautifulSoup

soup = BeautifulSoup(tb_search_result_html)



item_dom_list = soup.find_all("div", class_="item-box")



output_file = codecs.open('data.txt', 'w', encoding='gbk')

for item_dom in item_dom_list:

        item_attr = parseItemAttr(item_dom)

        output_file.write('\t'.join(item_attr.values()) + '\n')

output_file.close()
