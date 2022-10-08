create database StoreHM

create table [dbo].[product](
[id] [int] IDENTITY(1,1) not null,
[name] [nvarchar](max) null,
[image] [nvarchar](max) null,
[price] [money] null,
[description] [nvarchar](max) null,
[cateID][int] null,
[sell_ID] [int] null,
CONSTRAINT product_pk PRIMARY KEY (id),
FOREIGN KEY (cateID) REFERENCES Category(cateID),



)

CREATE TABLE [dbo].[Category](

[cateID][int] IDENTITY(1,1) not null,
[cname] [nvarchar](max) null,
CONSTRAINT Category_pk PRIMARY KEY (cateID)
)

CREATE TABLE [dbo].[Account](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[pass] [varchar](255) NULL,
	[isSell] [int] NULL,
	[isAdmin] [int] NULL,
	PRIMARY KEY(uID)
)

Drop table product
drop table Account
drop table Category
--Giày
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Jordan Tye Dye',N'https://product.hstatic.net/1000282067/product/air-jordan-1-retro-high-tie-dye-w_ea6ac24d0daa41879e5b18d3b8227346_1024x1024.jpeg',500,N'Nike Products',1,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Nike Force One Low',N'https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/b7d9211c-26e7-431a-ac24-b0540fb3c00f/air-force-1-07-shoes-WrLlWX.png',100,N'Nike Products',1,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Air Jordan One Mid',N'https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/30d848c1-27b4-4697-9dc7-9b2301622a8a/air-jordan-1-mid-shoe-86f1ZW.png',125,N'Nike Products',1,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Jordan One KO',N'https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/9117b8a7-8e50-4f02-a96f-a4a9598ab8a6/jordan-1-ko-shoes-RLJcHC.png',150,N'Nike Products',1,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Jordan One Mid',N'https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,b_rgb:f5f5f5/52fd5574-e151-4214-98df-e4cc9ae3497a/jordan-1-mid-infant-toddler-shoes-VxLp6j.png',55,N'Nike Products',1,1)








--Quần Áo
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Gucci x Ken Scott Print Zip-Up Jacket Black',N'https://cdn.vuahanghieu.com/unsafe/0x900/left/top/smart/filters:quality(90)/https://admin.vuahanghieu.com/upload/product/2022/09/ao-khoac-gucci-x-ken-scott-print-zip-up-jacket-black-ivory-mau-nau-size-46-631ae7c8433ba-09092022141416.jpg',1000,N'Gucci Products',2,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'Mens Baltimore Orioles Nike White Home Replica Team Jersey',N'https://fanatics.frgimages.com/baltimore-orioles/mens-nike-white-baltimore-orioles-home-replica-team-jersey_pi3588000_ff_3588527-aa19a31ceb5436a521b3_full.jpg?_hv=2&w=900',114,N'Mlb Products',2,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'MLB',N'https://www.taass.com/media/image/d5/57/be/image_881113_1.jpg',100,N'Mlb Products',2,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'MLB Los Angeles Dodgers',N'https://i.pinimg.com/originals/35/97/1c/35971c4f0293b98473ce3a71351f364b.jpg',120,N'Mlb Products',2,1)
insert [dbo].[product] ([name],[image],[price],[description],[cateID],[sell_ID]) values(N'MLB Seattle Mariners',N'https://us03-imgcdn.ymcart.com/73174/2021/06/23/c/b/cb7c3c3c8d45082c.jpg?x-oss-process=image/quality,Q_90/auto-orient,1/resize,m_lfit,w_1500,h_1500',150,N'Mlb Products',2,1)






--Sản Phẩm
insert [dbo].[Category] ([cname]) values(N'Footwear')
insert [dbo].[Category] ([cname]) values(N'Apparel')

--Account
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Adam', N'123456', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Anjolie', N'SNZ6HE', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Ferris', N'RXH3XJ', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Katell', N'HWV8ZN', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Zahir', N'NPX7OF', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Conan', N'WIZ5VZ', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Cade', N'ZSW2LU', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Micah', N'RVV5SR', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Rowan', N'VAI6XR', 1, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Kirby', N'DNX6JK', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Tanisha', N'XWU7JP', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Howard', N'TSR5MR', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Tana', N'EHS8CM', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Hadassah', N'YOY7ZW', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Echo', N'IGE8TN', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Slade', N'OFO6QS', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Devin', N'IBM6RZ', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Rowan', N'ZYS9VI', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Rafael', N'WZA0IH', 1, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Madaline', N'QMW4EN', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Vera', N'CZB2VM', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Declan', N'ZKE7QZ', 1, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Katell', N'SFS0IW', 1, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Summer', N'PSQ7LC', 0, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Robin', N'KIS9AF', 1, 1)
INSERT [dbo].[Account] ([user], [pass], [isSell], [isAdmin]) VALUES ( N'Dominique', N'IKV0IX', 0, 0)
INSERT [dbo].[Account] ([user], [pass], [isSell], [isAdmin]) VALUES ( N'admin', N'123', 1, 1)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'mra', N'mra', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'mrb', N'123', 0, 0)
INSERT [dbo].[Account] ( [user], [pass], [isSell], [isAdmin]) VALUES ( N'Camden', N'123', 0, 0)

        
