.class public final Lds8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgV8;


# static fields
.field public static final a:LgV8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lds8;

    invoke-direct {v0}, Lds8;-><init>()V

    sput-object v0, Lds8;->a:LgV8;

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

    invoke-static {p1}, Los8;->a(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
