.class public final LEC1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "LnV0;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    sget-object v1, LnV0;->d:LnV0;

    invoke-static {v0, v1}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LEC1;->a:Liy3;

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LEC1;->b:Liy3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
