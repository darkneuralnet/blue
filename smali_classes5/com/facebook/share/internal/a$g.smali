.class public final Lcom/facebook/share/internal/a$g;
.super LJ1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJ1;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V
    .locals 1

    invoke-static {}, Lcom/facebook/a;->e()Landroid/content/Context;

    move-result-object p1

    if-nez p2, :cond_0

    invoke-static {}, Lcom/facebook/share/internal/a;->v()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    rem-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/facebook/share/internal/a;->w(I)I

    const-string p2, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "OBJECT_SUFFIX"

    invoke-static {}, Lcom/facebook/share/internal/a;->v()I

    move-result v0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lcom/facebook/share/internal/a;->x()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-static {}, Lcom/facebook/share/internal/a;->y()Lpl1;

    move-result-object p1

    invoke-virtual {p1}, Lpl1;->f()V

    :cond_0
    const/4 p1, 0x0

    const-string p2, "com.facebook.sdk.LikeActionController.DID_RESET"

    invoke-static {p1, p2}, Lcom/facebook/share/internal/a;->z(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    return-void
.end method
