.class public final Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;",
        "",
        "()V",
        "from",
        "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
        "bullet",
        "Lcom/stripe/android/financialconnections/model/Bullet;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerDrivenUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenUi.kt\ncom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lcom/stripe/android/financialconnections/model/Bullet;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
    .locals 4

    const-string v0, "bullet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/Bullet;->getContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    :cond_2
    new-instance p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    invoke-direct {p1, v3, v1, v0}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)V

    return-object p1
.end method
