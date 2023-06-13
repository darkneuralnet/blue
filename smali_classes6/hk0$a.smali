.class public final Lhk0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhk0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhk0;

    invoke-direct {v0}, Lhk0;-><init>()V

    sput-object v0, Lhk0$a;->a:Lhk0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lhk0;
    .locals 1

    sget-object v0, Lhk0$a;->a:Lhk0;

    return-object v0
.end method
