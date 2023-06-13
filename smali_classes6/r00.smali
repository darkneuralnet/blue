.class public final Lr00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lp00;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lp00;
    .locals 1

    sget-object v0, Lr00;->a:Lp00;

    if-nez v0, :cond_0

    new-instance v0, Lp00;

    invoke-direct {v0}, Lp00;-><init>()V

    sput-object v0, Lr00;->a:Lp00;

    :cond_0
    sget-object v0, Lr00;->a:Lp00;

    return-object v0
.end method
