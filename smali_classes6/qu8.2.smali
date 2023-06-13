.class public final Lqu8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKI8;


# static fields
.field public static final a:LKI8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqu8;

    invoke-direct {v0}, Lqu8;-><init>()V

    sput-object v0, Lqu8;->a:LKI8;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 0

    invoke-static {p1}, LOt8;->a(I)LOt8;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
