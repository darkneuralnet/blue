.class public final Ljl8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LVF8;

.field public static final b:LvU8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, LVF8;->D()LlF8;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, LlF8;->q(Ljava/lang/String;)LlF8;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LVF8;

    sput-object v0, Ljl8;->a:LVF8;

    const-string v0, "/m/0jbk"

    invoke-static {v0}, LvU8;->u(Ljava/lang/Object;)LvU8;

    move-result-object v0

    sput-object v0, Ljl8;->b:LvU8;

    return-void
.end method

.method public static a(Lj38;)LuS7;
    .locals 2

    invoke-static {}, LuS7;->E()LfS7;

    move-result-object v0

    invoke-virtual {v0, p0}, LfS7;->r(Lj38;)LfS7;

    invoke-static {}, Lth8;->D()Lfh8;

    move-result-object p0

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lfh8;->q(I)Lfh8;

    invoke-virtual {v0, p0}, LfS7;->t(Lfh8;)LfS7;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LuS7;

    return-object p0
.end method

.method public static b(Lj38;)LuS7;
    .locals 2

    invoke-static {}, LuS7;->E()LfS7;

    move-result-object v0

    invoke-virtual {v0, p0}, LfS7;->r(Lj38;)LfS7;

    invoke-static {}, Lth8;->D()Lfh8;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lfh8;->p(Z)Lfh8;

    invoke-virtual {p0, v1}, Lfh8;->q(I)Lfh8;

    invoke-virtual {v0, p0}, LfS7;->t(Lfh8;)LfS7;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LuS7;

    return-object p0
.end method

.method public static c(Landroid/content/Context;ZLnx8;LVF8;)Lj38;
    .locals 3

    invoke-static {}, LNw7;->E()LNw7;

    move-result-object v0

    invoke-static {}, Lo48;->D()Lj38;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-static {v2, p2}, Ljl8;->l(Landroid/content/res/AssetManager;Lnx8;)LFF7;

    move-result-object p2

    const/4 v2, 0x0

    invoke-static {p2, p3, p1, v0, v2}, Ljl8;->j(LFF7;LVF8;ZLNw7;I)Lds7;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj38;->q(Lds7;)Lj38;

    invoke-static {p0}, Ljl8;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, p0}, Lj38;->t(Ljava/lang/String;)Lj38;

    invoke-virtual {v1, p0}, Lj38;->A(Ljava/lang/String;)Lj38;

    :cond_0
    return-object v1
.end method

.method public static d(Landroid/content/Context;ZLnx8;LVF8;JLfx7;)Lj38;
    .locals 5

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p4

    invoke-static {p4, p2}, Ljl8;->l(Landroid/content/res/AssetManager;Lnx8;)LFF7;

    move-result-object p2

    invoke-static {p0}, Ljl8;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljl8;->i(Z)I

    move-result p4

    invoke-static {}, Lo48;->D()Lj38;

    move-result-object p5

    invoke-static {}, LB78;->D()Lm78;

    move-result-object v0

    invoke-static {}, LhW7;->D()LpU7;

    move-result-object v1

    invoke-static {}, LTV7;->D()LCU7;

    move-result-object v2

    const-string v3, "MobileObjectLocalizerV3_1TfLiteClient"

    invoke-virtual {v2, v3}, LCU7;->p(Ljava/lang/String;)LCU7;

    const-wide/32 v3, 0x493e0

    invoke-virtual {v2, v3, v4}, LCU7;->q(J)LCU7;

    invoke-virtual {v1, v2}, LpU7;->p(LCU7;)LpU7;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object v1

    check-cast v1, LhW7;

    invoke-virtual {v0, v1}, Lm78;->p(LhW7;)Lm78;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LB78;

    invoke-virtual {p5, v0}, Lj38;->D(LB78;)Lj38;

    if-eqz p0, :cond_0

    invoke-virtual {p5, p0}, Lj38;->t(Ljava/lang/String;)Lj38;

    invoke-virtual {p5, p0}, Lj38;->A(Ljava/lang/String;)Lj38;

    :cond_0
    if-eqz p6, :cond_1

    invoke-virtual {p5, p6}, Lj38;->r(Lfx7;)Lj38;

    :cond_1
    const/4 p0, 0x1

    invoke-virtual {p5, p0}, Lj38;->B(Z)Lj38;

    invoke-static {}, LKM8;->E()LKM8;

    move-result-object p0

    invoke-virtual {p5, p0}, Lj38;->G(LKM8;)Lj38;

    invoke-static {}, LSO7;->D()LoO7;

    move-result-object p0

    const/4 p6, 0x0

    invoke-virtual {p0, p6}, LoO7;->r(Z)LoO7;

    invoke-virtual {p0, p4}, LoO7;->q(I)LoO7;

    const p4, 0x3e4ccccd    # 0.2f

    invoke-virtual {p0, p4}, LoO7;->t(F)LoO7;

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, LoO7;->p(F)LoO7;

    const/4 p4, 0x3

    invoke-virtual {p0, p4}, LoO7;->A(I)LoO7;

    invoke-virtual {p5, p0}, Lj38;->C(LoO7;)Lj38;

    invoke-static {}, LNw7;->E()LNw7;

    move-result-object p0

    invoke-static {p2, p3, p1, p0, p6}, Ljl8;->j(LFF7;LVF8;ZLNw7;I)Lds7;

    move-result-object p0

    invoke-virtual {p5, p0}, Lj38;->q(Lds7;)Lj38;

    return-object p5
.end method

.method public static e(Lnx8;)LVF8;
    .locals 3

    invoke-static {}, LNw7;->E()LNw7;

    move-result-object v0

    invoke-static {}, LCw8;->D()Low8;

    move-result-object v1

    invoke-virtual {v1, p0}, Low8;->q(Lnx8;)Low8;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LCw8;

    invoke-static {}, LVF8;->D()LlF8;

    move-result-object v1

    sget-object v2, Ljl8;->b:LvU8;

    invoke-virtual {v1, v2}, LlF8;->p(Ljava/lang/Iterable;)LlF8;

    invoke-virtual {v1, v0}, LlF8;->r(LNw7;)LlF8;

    invoke-virtual {v1, p0}, LlF8;->B(LCw8;)LlF8;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LVF8;

    return-object p0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "odt/v1"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "Unable to create accelerator directory "

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "MlKitObjectsConfigs"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    const-string v0, "mlkit_odt_default_classifier/labeler_with_validation.tflite"

    return-object v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    const-string v0, "mlkit_odt_localizer/localizer_with_validation.tflite"

    return-object v0
.end method

.method public static i(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x5

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static j(LFF7;LVF8;ZLNw7;I)Lds7;
    .locals 3

    invoke-static {}, LVs7;->D()Lds7;

    move-result-object p4

    const/4 v0, 0x1

    invoke-virtual {p4, v0}, Lds7;->t(Z)Lds7;

    invoke-static {}, LJF7;->E()LDF7;

    move-result-object v1

    const-string v2, "MobileSSDTfLiteClient"

    invoke-virtual {v1, v2}, LDF7;->A(Ljava/lang/String;)LDF7;

    invoke-virtual {v1, v0}, LDF7;->q(Z)LDF7;

    invoke-virtual {v1, p0}, LDF7;->t(LFF7;)LDF7;

    invoke-virtual {v1, p3}, LDF7;->r(LNw7;)LDF7;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LJF7;

    invoke-virtual {p4, p0}, Lds7;->r(LJF7;)Lds7;

    invoke-virtual {p4, p1}, Lds7;->q(LVF8;)Lds7;

    invoke-static {}, LZu8;->D()LMu8;

    move-result-object p0

    invoke-static {}, Lmu8;->D()LXt8;

    move-result-object p1

    const-string p3, "/m/0bl9f"

    invoke-virtual {p1, p3}, LXt8;->p(Ljava/lang/String;)LXt8;

    const p3, 0x3eeb851f    # 0.46f

    invoke-virtual {p1, p3}, LXt8;->q(F)LXt8;

    invoke-virtual {p0, p1}, LMu8;->p(LXt8;)LMu8;

    invoke-virtual {p4, p0}, Lds7;->p(LMu8;)Lds7;

    xor-int/lit8 p0, p2, 0x1

    invoke-virtual {p4, p0}, Lds7;->D(Z)Lds7;

    invoke-static {p2}, Ljl8;->i(Z)I

    move-result p0

    invoke-virtual {p4, p0}, Lds7;->B(I)Lds7;

    const p0, 0x3f19999a    # 0.6f

    invoke-virtual {p4, p0}, Lds7;->A(F)Lds7;

    const/4 p0, 0x0

    invoke-virtual {p4, p0}, Lds7;->C(I)Lds7;

    return-object p4
.end method

.method public static k(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Lkt7;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p1, "mlkit_odt_localizer/"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lkt7;->F(Ljava/io/InputStream;)Lkt7;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroid/content/res/AssetManager;Lnx8;)LFF7;
    .locals 4

    const-string v0, "mlkit_odt_localizer"

    :try_start_0
    invoke-static {}, LHF7;->D()LGF7;

    move-result-object v1

    invoke-virtual {p1}, Lnx8;->D()I

    move-result v2

    invoke-virtual {v1, v2}, LGF7;->p(I)LGF7;

    invoke-virtual {p1}, Lnx8;->F()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LGF7;->r(J)LGF7;

    invoke-virtual {p1}, Lnx8;->E()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LGF7;->q(J)LGF7;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LHF7;

    invoke-static {}, LFF7;->D()LEF7;

    move-result-object v1

    invoke-virtual {v1, p1}, LEF7;->r(LHF7;)LEF7;

    const-string p1, "mobile_object_localizer_labelmap"

    invoke-static {p0, v0, p1}, Ljl8;->k(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Lkt7;

    move-result-object p1

    invoke-virtual {v1, p1}, LEF7;->q(Lkt7;)LEF7;

    const-string p1, "mobile_object_localizer_3_1_anchors.pb"

    invoke-static {p0, v0, p1}, Ljl8;->k(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Lkt7;

    move-result-object p0

    invoke-virtual {v1, p0}, LEF7;->p(Lkt7;)LEF7;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LFF7;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "MlKitObjectsConfigs"

    const-string v0, "Failed to create detector client options: "

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, LFF7;->F()LFF7;

    move-result-object p0

    return-object p0
.end method
