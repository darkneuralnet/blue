.class public final Lf4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lf4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4;

    invoke-direct {v0}, Lf4;-><init>()V

    sput-object v0, Lf4$a;->a:Lf4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lf4;
    .locals 1

    sget-object v0, Lf4$a;->a:Lf4;

    return-object v0
.end method