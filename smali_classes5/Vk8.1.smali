.class public final LVk8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;FI)LuS7;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, LCw8;->D()Low8;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    const-string v1, "mlkit_label_default_model/mobile_ica_8bit_with_metadata_tflite"

    invoke-virtual {p0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lkt7;->F(Ljava/io/InputStream;)Lkt7;

    move-result-object p0

    invoke-virtual {v0, p0}, Low8;->p(Lkt7;)Low8;

    const/4 p0, 0x0

    invoke-static {v0, p1, p2, p0}, LVk8;->b(Low8;FILow8;)LuS7;

    move-result-object p0

    return-object p0
.end method

.method public static b(Low8;FILow8;)LuS7;
    .locals 1

    invoke-static {}, LVF8;->D()LlF8;

    move-result-object v0

    invoke-virtual {v0, p0}, LlF8;->A(Low8;)LlF8;

    invoke-virtual {v0, p2}, LlF8;->t(I)LlF8;

    const/4 p0, 0x0

    cmpl-float p0, p1, p0

    if-ltz p0, :cond_0

    invoke-virtual {v0, p1}, LlF8;->C(F)LlF8;

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, LlF8;->D(Low8;)LlF8;

    :cond_1
    invoke-static {}, LuS7;->E()LfS7;

    move-result-object p0

    invoke-static {}, Lo48;->D()Lj38;

    move-result-object p1

    invoke-virtual {p1, v0}, Lj38;->p(LlF8;)Lj38;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lj38;->B(Z)Lj38;

    invoke-virtual {p0, p1}, LfS7;->r(Lj38;)LfS7;

    invoke-static {}, Lth8;->D()Lfh8;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lfh8;->q(I)Lfh8;

    invoke-virtual {p0, p1}, LfS7;->t(Lfh8;)LfS7;

    invoke-static {}, LaH8;->D()LvA8;

    move-result-object p1

    invoke-virtual {p1, p2}, LvA8;->p(I)LvA8;

    invoke-virtual {p0, p1}, LfS7;->q(LvA8;)LfS7;

    invoke-virtual {p0}, LZt7;->l()Leu7;

    move-result-object p0

    check-cast p0, LuS7;

    return-object p0
.end method
