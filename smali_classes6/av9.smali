.class public final Lav9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcn9;


# static fields
.field public static final a:Lcn9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lav9;

    invoke-direct {v0}, Lav9;-><init>()V

    sput-object v0, Lav9;->a:Lcn9;

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

    invoke-static {p1}, LGv9;->b(I)LGv9;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
