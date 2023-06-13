.class public final synthetic LPm8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# static fields
.field public static final synthetic a:LPm8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LPm8;

    invoke-direct {v0}, LPm8;-><init>()V

    sput-object v0, LPm8;->a:LPm8;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    const-string p1, ""

    invoke-static {p1}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method
