.class public final Ljy0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljy0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ljy0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljy0;

    invoke-direct {v0}, Ljy0;-><init>()V

    sput-object v0, Ljy0$a;->a:Ljy0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljy0;
    .locals 1

    sget-object v0, Ljy0$a;->a:Ljy0;

    return-object v0
.end method
