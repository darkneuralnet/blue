.class public final Lcu5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcu5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcu5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcu5;

    invoke-direct {v0}, Lcu5;-><init>()V

    sput-object v0, Lcu5$a;->a:Lcu5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lcu5;
    .locals 1

    sget-object v0, Lcu5$a;->a:Lcu5;

    return-object v0
.end method
