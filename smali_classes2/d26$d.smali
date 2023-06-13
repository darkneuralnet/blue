.class public Ld26$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld26;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:F


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ld26$d;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Ld26$d;->b:F

    return-void
.end method

.method public synthetic constructor <init>(Ld26$a;)V
    .locals 0

    invoke-direct {p0}, Ld26$d;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld26$d;)F
    .locals 0

    iget p0, p0, Ld26$d;->b:F

    return p0
.end method

.method public static synthetic b(Ld26$d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld26$d;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;F)V
    .locals 0

    iput-object p1, p0, Ld26$d;->a:Ljava/lang/String;

    iput p2, p0, Ld26$d;->b:F

    return-void
.end method
