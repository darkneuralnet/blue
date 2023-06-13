.class public final Lcom/bumptech/glide/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)Lcom/bumptech/glide/Registry;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a;",
            "Ljava/util/List<",
            "LLC1;",
            ">;",
            "Lbj;",
            ")",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/a;->f()LeU;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bumptech/glide/a;->e()Lto;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/d;

    move-result-object v3

    new-instance v4, Lcom/bumptech/glide/Registry;

    invoke-direct {v4}, Lcom/bumptech/glide/Registry;-><init>()V

    invoke-static {v2, v4, v0, v1, v3}, Lcom/bumptech/glide/e;->b(Landroid/content/Context;Lcom/bumptech/glide/Registry;LeU;Lto;Lcom/bumptech/glide/d;)V

    invoke-static {v2, p0, v4, p1, p2}, Lcom/bumptech/glide/e;->c(Landroid/content/Context;Lcom/bumptech/glide/a;Lcom/bumptech/glide/Registry;Ljava/util/List;Lbj;)V

    return-object v4
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/Registry;LeU;Lto;Lcom/bumptech/glide/d;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;

    invoke-direct {v4}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V

    invoke-virtual {v1, v4}, Lcom/bumptech/glide/Registry;->r(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1b

    if-lt v4, v5, :cond_0

    new-instance v5, LYh1;

    invoke-direct {v5}, LYh1;-><init>()V

    invoke-virtual {v1, v5}, Lcom/bumptech/glide/Registry;->r(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v6

    new-instance v7, LC70;

    invoke-direct {v7, v0, v6, v2, v3}, LC70;-><init>(Landroid/content/Context;Ljava/util/List;LeU;Lto;)V

    invoke-static/range {p2 .. p2}, Lcp6;->l(LeU;)LbM4;

    move-result-object v8

    new-instance v9, Li61;

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-direct {v9, v10, v11, v2, v3}, Li61;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;LeU;Lto;)V

    const/16 v10, 0x1c

    if-lt v4, v10, :cond_1

    const-class v11, Lcom/bumptech/glide/b$b;

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, Lcom/bumptech/glide/d;->a(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_1

    new-instance v11, Lq32;

    invoke-direct {v11}, Lq32;-><init>()V

    new-instance v12, Ly70;

    invoke-direct {v12}, Ly70;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v12, Lw70;

    invoke-direct {v12, v9}, Lw70;-><init>(Li61;)V

    new-instance v11, LnR5;

    invoke-direct {v11, v9, v3}, LnR5;-><init>(Li61;Lto;)V

    :goto_0
    const-string v13, "Animation"

    const-class v14, Landroid/graphics/drawable/Drawable;

    const-class v15, Ljava/nio/ByteBuffer;

    move-object/from16 v16, v7

    const-class v7, Ljava/io/InputStream;

    if-lt v4, v10, :cond_2

    invoke-static {v6, v3}, Ldf;->f(Ljava/util/List;Lto;)LbM4;

    move-result-object v10

    invoke-virtual {v1, v13, v7, v14, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    invoke-static {v6, v3}, Ldf;->a(Ljava/util/List;Lto;)LbM4;

    move-result-object v10

    invoke-virtual {v1, v13, v15, v14, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    :cond_2
    new-instance v10, LdM4;

    invoke-direct {v10, v0}, LdM4;-><init>(Landroid/content/Context;)V

    move/from16 v17, v4

    new-instance v4, LkM4$c;

    invoke-direct {v4, v5}, LkM4$c;-><init>(Landroid/content/res/Resources;)V

    new-instance v0, LkM4$d;

    invoke-direct {v0, v5}, LkM4$d;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 p4, v0

    new-instance v0, LkM4$b;

    invoke-direct {v0, v5}, LkM4$b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v18, v0

    new-instance v0, LkM4$a;

    invoke-direct {v0, v5}, LkM4$a;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v19, v0

    new-instance v0, LVT;

    invoke-direct {v0, v3}, LVT;-><init>(Lto;)V

    move-object/from16 v20, v4

    new-instance v4, LLT;

    invoke-direct {v4}, LLT;-><init>()V

    move-object/from16 v21, v4

    new-instance v4, LvC1;

    invoke-direct {v4}, LvC1;-><init>()V

    move-object/from16 v22, v4

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    move-object/from16 v23, v4

    new-instance v4, LA70;

    invoke-direct {v4}, LA70;-><init>()V

    invoke-virtual {v1, v15, v4}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lmb1;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    move-object/from16 v24, v10

    new-instance v10, LsR5;

    invoke-direct {v10, v3}, LsR5;-><init>(Lto;)V

    invoke-virtual {v4, v7, v10}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Lmb1;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    const-string v10, "Bitmap"

    move-object/from16 v25, v14

    const-class v14, Landroid/graphics/Bitmap;

    invoke-virtual {v4, v10, v15, v14, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    invoke-virtual {v4, v10, v7, v14, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v4

    move-object/from16 v26, v13

    const-class v13, Landroid/os/ParcelFileDescriptor;

    if-eqz v4, :cond_3

    new-instance v4, LOE3;

    invoke-direct {v4, v9}, LOE3;-><init>(Li61;)V

    invoke-virtual {v1, v10, v13, v14, v4}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    :cond_3
    invoke-virtual {v1, v10, v13, v14, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    invoke-static/range {p2 .. p2}, Lcp6;->c(LeU;)LbM4;

    move-result-object v9

    const-class v1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v4, v10, v1, v14, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    invoke-static {}, Lde6$a;->a()Lde6$a;

    move-result-object v9

    invoke-virtual {v4, v14, v14, v9}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, LTd6;

    invoke-direct {v9}, LTd6;-><init>()V

    invoke-virtual {v4, v10, v14, v14, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    invoke-virtual {v4, v14, v0}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LeM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, LRT;

    invoke-direct {v9, v5, v12}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    const-string v12, "BitmapDrawable"

    move-object/from16 v27, v1

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v4, v12, v15, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, LRT;

    invoke-direct {v9, v5, v11}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    invoke-virtual {v4, v12, v7, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v9, LRT;

    invoke-direct {v9, v5, v8}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    invoke-virtual {v4, v12, v13, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v4

    new-instance v8, LST;

    invoke-direct {v8, v2, v0}, LST;-><init>(LeU;LeM4;)V

    invoke-virtual {v4, v1, v8}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LeM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LtR5;

    move-object/from16 v8, v16

    invoke-direct {v4, v6, v8, v3}, LtR5;-><init>(Ljava/util/List;LbM4;Lto;)V

    const-class v6, LuC1;

    move-object/from16 v9, v26

    invoke-virtual {v0, v9, v7, v6, v4}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v9, v15, v6, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LwC1;

    invoke-direct {v4}, LwC1;-><init>()V

    invoke-virtual {v0, v6, v4}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LeM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, Lde6$a;->a()Lde6$a;

    move-result-object v4

    const-class v8, LtC1;

    invoke-virtual {v0, v8, v8, v4}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LBC1;

    invoke-direct {v4, v2}, LBC1;-><init>(LeU;)V

    invoke-virtual {v0, v10, v8, v14, v4}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    const-class v4, Landroid/net/Uri;

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    invoke-virtual {v0, v4, v9, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v10, LWL4;

    invoke-direct {v10, v8, v2}, LWL4;-><init>(LdM4;LeU;)V

    invoke-virtual {v0, v4, v14, v10}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, LD70$a;

    invoke-direct {v8}, LD70$a;-><init>()V

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/Registry;->s(Lcom/bumptech/glide/load/data/a$a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, LB70$b;

    invoke-direct {v8}, LB70$b;-><init>()V

    const-class v10, Ljava/io/File;

    invoke-virtual {v0, v10, v15, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lml1$e;

    invoke-direct {v8}, Lml1$e;-><init>()V

    invoke-virtual {v0, v10, v7, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lgl1;

    invoke-direct {v8}, Lgl1;-><init>()V

    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lml1$b;

    invoke-direct {v8}, Lml1$b;-><init>()V

    invoke-virtual {v0, v10, v13, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, Lde6$a;->a()Lde6$a;

    move-result-object v8

    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lcom/bumptech/glide/load/data/c$a;

    invoke-direct {v8, v3}, Lcom/bumptech/glide/load/data/c$a;-><init>(Lto;)V

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/Registry;->s(Lcom/bumptech/glide/load/data/a$a;)Lcom/bumptech/glide/Registry;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    move-object/from16 v3, p1

    move-object/from16 v8, v27

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/Registry;->s(Lcom/bumptech/glide/load/data/a$a;)Lcom/bumptech/glide/Registry;

    goto :goto_1

    :cond_4
    move-object/from16 v3, p1

    move-object/from16 v8, v27

    :goto_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v11, v20

    invoke-virtual {v3, v0, v7, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v12

    move-object/from16 v16, v6

    move-object/from16 v6, v18

    invoke-virtual {v12, v0, v13, v6}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v12

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v12, v2, v7, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v11

    invoke-virtual {v11, v2, v13, v6}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v6

    move-object/from16 v11, p4

    invoke-virtual {v6, v2, v4, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v6

    move-object/from16 v12, v19

    invoke-virtual {v6, v0, v8, v12}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v6

    invoke-virtual {v6, v2, v8, v12}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v2

    invoke-virtual {v2, v0, v4, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LdT0$c;

    invoke-direct {v2}, LdT0$c;-><init>()V

    const-class v6, Ljava/lang/String;

    invoke-virtual {v0, v6, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LdT0$c;

    invoke-direct {v2}, LdT0$c;-><init>()V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LYR5$c;

    invoke-direct {v2}, LYR5$c;-><init>()V

    invoke-virtual {v0, v6, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LYR5$b;

    invoke-direct {v2}, LYR5$b;-><init>()V

    invoke-virtual {v0, v6, v13, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LYR5$a;

    invoke-direct {v2}, LYR5$a;-><init>()V

    invoke-virtual {v0, v6, v8, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lap$c;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    invoke-direct {v2, v6}, Lap$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lap$b;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    invoke-direct {v2, v6}, Lap$b;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v8, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LHP2$a;

    move-object/from16 v6, p0

    invoke-direct {v2, v6}, LHP2$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LLP2$a;

    invoke-direct {v2, v6}, LLP2$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    const/16 v0, 0x1d

    move/from16 v2, v17

    if-lt v2, v0, :cond_5

    new-instance v0, Lkb4$c;

    invoke-direct {v0, v6}, Lkb4$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4, v7, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    new-instance v0, Lkb4$b;

    invoke-direct {v0, v6}, Lkb4$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4, v13, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    :cond_5
    new-instance v0, LEf6$d;

    move-object/from16 v2, v23

    invoke-direct {v0, v2}, LEf6$d;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v3, v4, v7, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, LEf6$b;

    invoke-direct {v11, v2}, LEf6$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v13, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, LEf6$a;

    invoke-direct {v11, v2}, LEf6$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v8, v11}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LRf6$a;

    invoke-direct {v2}, LRf6$a;-><init>()V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LMf6$a;

    invoke-direct {v2}, LMf6$a;-><init>()V

    const-class v8, Ljava/net/URL;

    invoke-virtual {v0, v8, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LGP2$a;

    invoke-direct {v2, v6}, LGP2$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v10, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LCN1$a;

    invoke-direct {v2}, LCN1$a;-><init>()V

    const-class v6, LOC1;

    invoke-virtual {v0, v6, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lp70$a;

    invoke-direct {v2}, Lp70$a;-><init>()V

    const-class v6, [B

    invoke-virtual {v0, v6, v15, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lp70$d;

    invoke-direct {v2}, Lp70$d;-><init>()V

    invoke-virtual {v0, v6, v7, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, Lde6$a;->a()Lde6$a;

    move-result-object v2

    invoke-virtual {v0, v4, v4, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, Lde6$a;->a()Lde6$a;

    move-result-object v2

    invoke-virtual {v0, v9, v9, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LXU2;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, Lce6;

    invoke-direct {v2}, Lce6;-><init>()V

    invoke-virtual {v0, v9, v9, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LTT;

    invoke-direct {v2, v5}, LTT;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v0, v14, v1, v2}, Lcom/bumptech/glide/Registry;->t(Ljava/lang/Class;Ljava/lang/Class;LtM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v2, v21

    invoke-virtual {v0, v14, v6, v2}, Lcom/bumptech/glide/Registry;->t(Ljava/lang/Class;Ljava/lang/Class;LtM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LO61;

    move-object/from16 v7, p2

    move-object/from16 v8, v22

    invoke-direct {v4, v7, v2, v8}, LO61;-><init>(LeU;LtM4;LtM4;)V

    invoke-virtual {v0, v9, v6, v4}, Lcom/bumptech/glide/Registry;->t(Ljava/lang/Class;Ljava/lang/Class;LtM4;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v2, v16

    invoke-virtual {v0, v2, v6, v8}, Lcom/bumptech/glide/Registry;->t(Ljava/lang/Class;Ljava/lang/Class;LtM4;)Lcom/bumptech/glide/Registry;

    invoke-static/range {p2 .. p2}, Lcp6;->d(LeU;)LbM4;

    move-result-object v0

    invoke-virtual {v3, v15, v14, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    new-instance v2, LRT;

    invoke-direct {v2, v5, v0}, LRT;-><init>(Landroid/content/res/Resources;LbM4;)V

    invoke-virtual {v3, v15, v1, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LbM4;)Lcom/bumptech/glide/Registry;

    return-void
.end method

.method public static c(Landroid/content/Context;Lcom/bumptech/glide/a;Lcom/bumptech/glide/Registry;Ljava/util/List;Lbj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/a;",
            "Lcom/bumptech/glide/Registry;",
            "Ljava/util/List<",
            "LLC1;",
            ">;",
            "Lbj;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLC1;

    :try_start_0
    invoke-interface {v0, p0, p1, p2}, LLt4;->b(Landroid/content/Context;Lcom/bumptech/glide/a;Lcom/bumptech/glide/Registry;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual {p4, p0, p1, p2}, Lqq2;->b(Landroid/content/Context;Lcom/bumptech/glide/a;Lcom/bumptech/glide/Registry;)V

    :cond_1
    return-void
.end method

.method public static d(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)LMC1$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a;",
            "Ljava/util/List<",
            "LLC1;",
            ">;",
            "Lbj;",
            ")",
            "LMC1$b<",
            "Lcom/bumptech/glide/Registry;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/e$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/e$a;-><init>(Lcom/bumptech/glide/a;Ljava/util/List;Lbj;)V

    return-object v0
.end method
