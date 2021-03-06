USE [pikapika_db]
GO
/****** Object:  Table [dbo].[almacen]    Script Date: 27/11/2018 19:51:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[almacen](
	[id_almacen] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](512) NOT NULL,
	[id_ciudad] [int] NOT NULL,
	[activo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_almacen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[bodega]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[bodega](
	[id_bodega] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](512) NULL,
	[id_ciudad] [int] NOT NULL,
	[activo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_bodega] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ciudad]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ciudad](
	[id_ciudad] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](512) NOT NULL,
	[activo] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_ciudad] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[estados]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[estados](
	[id_estado] [int] IDENTITY(1,1) NOT NULL,
	[descipcion] [varchar](45) NULL DEFAULT (NULL),
	[activo] [int] NULL DEFAULT ('1'),
PRIMARY KEY CLUSTERED 
(
	[id_estado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[linea]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[linea](
	[id_linea] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](512) NOT NULL,
	[id_propietario] [int] NOT NULL,
	[activo] [int] NOT NULL DEFAULT ('1'),
PRIMARY KEY CLUSTERED 
(
	[id_linea] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log_orden]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[log_orden](
	[id_log_orden] [int] IDENTITY(1,1) NOT NULL,
	[id_orden] [int] NOT NULL,
	[id_estado] [int] NOT NULL,
	[log_fecha] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_log_orden] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[orden]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[orden](
	[id_orden] [int] IDENTITY(1,1) NOT NULL,
	[id_almacen] [int] NOT NULL,
	[descripcion] [varchar](512) NULL,
	[fecha_modificacion] [datetime] NULL,
	[id_estado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_orden] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[orden_detalle]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orden_detalle](
	[id_orden_detalle] [int] IDENTITY(1,1) NOT NULL,
	[id_orden] [int] NOT NULL,
	[id_producto] [int] NOT NULL,
	[id_bodega] [int] NOT NULL,
	[cantidad] [int] NULL,
	[fecha_modificacion] [datetime] NULL,
	[id_estado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_orden_detalle] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[producto]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[producto](
	[id_producto] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](512) NULL,
	[precio] [int] NULL,
	[activo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[producto_bodega]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[producto_bodega](
	[id_producto_bodega] [int] IDENTITY(1,1) NOT NULL,
	[id_producto] [int] NULL,
	[id_bodega] [int] NULL,
	[stock] [int] NULL,
	[activo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_producto_bodega] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[producto_linea]    Script Date: 27/11/2018 19:51:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[producto_linea](
	[id_producto_linea] [int] IDENTITY(1,1) NOT NULL,
	[id_producto] [int] NULL,
	[id_linea] [int] NULL,
	[activo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_producto_linea] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[estados] ON 

GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (1, N'Activo', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (2, N'Nuevo', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (3, N'Cancelado', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (4, N'Bloqueado', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (5, N'Eliminado', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (6, N'Procesando', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (7, N'Despachado', 1)
GO
INSERT [dbo].[estados] ([id_estado], [descipcion], [activo]) VALUES (8, N'Entregado', 1)
GO
SET IDENTITY_INSERT [dbo].[estados] OFF
GO
SET IDENTITY_INSERT [dbo].[linea] ON 

GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (1, N'Root', 1, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (2, N'Muebleria', 1, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (3, N'Muebleria Interna', 2, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (4, N'Muebleria Externa', 2, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (5, N'Base Metalica', 1, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (6, N'Sillas Patio', 5, 1)
GO
INSERT [dbo].[linea] ([id_linea], [nombre], [id_propietario], [activo]) VALUES (7, N'Base Metalica', 1, 1)
GO
SET IDENTITY_INSERT [dbo].[linea] OFF
GO
ALTER TABLE [dbo].[almacen] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[bodega] ADD  DEFAULT (NULL) FOR [descripcion]
GO
ALTER TABLE [dbo].[bodega] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[ciudad] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[log_orden] ADD  DEFAULT (NULL) FOR [log_fecha]
GO
ALTER TABLE [dbo].[orden] ADD  DEFAULT (NULL) FOR [descripcion]
GO
ALTER TABLE [dbo].[orden] ADD  DEFAULT (NULL) FOR [fecha_modificacion]
GO
ALTER TABLE [dbo].[orden_detalle] ADD  DEFAULT (NULL) FOR [cantidad]
GO
ALTER TABLE [dbo].[orden_detalle] ADD  DEFAULT (NULL) FOR [fecha_modificacion]
GO
ALTER TABLE [dbo].[orden_detalle] ADD  DEFAULT ('1') FOR [id_estado]
GO
ALTER TABLE [dbo].[producto] ADD  DEFAULT (NULL) FOR [nombre]
GO
ALTER TABLE [dbo].[producto] ADD  DEFAULT (NULL) FOR [precio]
GO
ALTER TABLE [dbo].[producto] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[producto_bodega] ADD  DEFAULT (NULL) FOR [id_producto]
GO
ALTER TABLE [dbo].[producto_bodega] ADD  DEFAULT (NULL) FOR [id_bodega]
GO
ALTER TABLE [dbo].[producto_bodega] ADD  DEFAULT (NULL) FOR [stock]
GO
ALTER TABLE [dbo].[producto_bodega] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[producto_linea] ADD  DEFAULT (NULL) FOR [id_producto]
GO
ALTER TABLE [dbo].[producto_linea] ADD  DEFAULT (NULL) FOR [id_linea]
GO
ALTER TABLE [dbo].[producto_linea] ADD  DEFAULT ('1') FOR [activo]
GO
ALTER TABLE [dbo].[almacen]  WITH CHECK ADD  CONSTRAINT [fk_Ciudad_Almacen] FOREIGN KEY([id_ciudad])
REFERENCES [dbo].[ciudad] ([id_ciudad])
GO
ALTER TABLE [dbo].[almacen] CHECK CONSTRAINT [fk_Ciudad_Almacen]
GO
ALTER TABLE [dbo].[bodega]  WITH CHECK ADD  CONSTRAINT [fk_Ciudad_Bodega] FOREIGN KEY([id_ciudad])
REFERENCES [dbo].[ciudad] ([id_ciudad])
GO
ALTER TABLE [dbo].[bodega] CHECK CONSTRAINT [fk_Ciudad_Bodega]
GO
ALTER TABLE [dbo].[linea]  WITH CHECK ADD  CONSTRAINT [fk_linea_parent] FOREIGN KEY([id_propietario])
REFERENCES [dbo].[linea] ([id_linea])
GO
ALTER TABLE [dbo].[linea] CHECK CONSTRAINT [fk_linea_parent]
GO
ALTER TABLE [dbo].[log_orden]  WITH CHECK ADD  CONSTRAINT [fk_Log_Orden] FOREIGN KEY([id_orden])
REFERENCES [dbo].[orden] ([id_orden])
GO
ALTER TABLE [dbo].[log_orden] CHECK CONSTRAINT [fk_Log_Orden]
GO
ALTER TABLE [dbo].[orden]  WITH CHECK ADD  CONSTRAINT [fk_Orden_Almacen] FOREIGN KEY([id_almacen])
REFERENCES [dbo].[almacen] ([id_almacen])
GO
ALTER TABLE [dbo].[orden] CHECK CONSTRAINT [fk_Orden_Almacen]
GO
ALTER TABLE [dbo].[orden_detalle]  WITH CHECK ADD  CONSTRAINT [fk_Detalle_Bodega] FOREIGN KEY([id_bodega])
REFERENCES [dbo].[bodega] ([id_bodega])
GO
ALTER TABLE [dbo].[orden_detalle] CHECK CONSTRAINT [fk_Detalle_Bodega]
GO
ALTER TABLE [dbo].[orden_detalle]  WITH CHECK ADD  CONSTRAINT [fk_Detalle_Orden] FOREIGN KEY([id_orden])
REFERENCES [dbo].[orden] ([id_orden])
GO
ALTER TABLE [dbo].[orden_detalle] CHECK CONSTRAINT [fk_Detalle_Orden]
GO
ALTER TABLE [dbo].[orden_detalle]  WITH CHECK ADD  CONSTRAINT [fk_Detalle_Producto] FOREIGN KEY([id_producto])
REFERENCES [dbo].[producto] ([id_producto])
GO
ALTER TABLE [dbo].[orden_detalle] CHECK CONSTRAINT [fk_Detalle_Producto]
GO
ALTER TABLE [dbo].[orden_detalle]  WITH CHECK ADD  CONSTRAINT [fl_Log_Estado] FOREIGN KEY([id_estado])
REFERENCES [dbo].[estados] ([id_estado])
GO
ALTER TABLE [dbo].[orden_detalle] CHECK CONSTRAINT [fl_Log_Estado]
GO
ALTER TABLE [dbo].[producto_bodega]  WITH CHECK ADD  CONSTRAINT [fk_Bodega_Inventario] FOREIGN KEY([id_bodega])
REFERENCES [dbo].[bodega] ([id_bodega])
GO
ALTER TABLE [dbo].[producto_bodega] CHECK CONSTRAINT [fk_Bodega_Inventario]
GO
ALTER TABLE [dbo].[producto_bodega]  WITH CHECK ADD  CONSTRAINT [fk_Producto_Inventario] FOREIGN KEY([id_producto])
REFERENCES [dbo].[producto] ([id_producto])
GO
ALTER TABLE [dbo].[producto_bodega] CHECK CONSTRAINT [fk_Producto_Inventario]
GO
ALTER TABLE [dbo].[producto_linea]  WITH CHECK ADD  CONSTRAINT [fk_Linea_Referencia] FOREIGN KEY([id_linea])
REFERENCES [dbo].[linea] ([id_linea])
GO
ALTER TABLE [dbo].[producto_linea] CHECK CONSTRAINT [fk_Linea_Referencia]
GO
ALTER TABLE [dbo].[producto_linea]  WITH CHECK ADD  CONSTRAINT [fk_Producto_Referencia] FOREIGN KEY([id_producto])
REFERENCES [dbo].[producto] ([id_producto])
GO
ALTER TABLE [dbo].[producto_linea] CHECK CONSTRAINT [fk_Producto_Referencia]
GO
