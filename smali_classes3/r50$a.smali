.class public final Lr50$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr50;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lr50;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr50;

    invoke-direct {v0}, Lr50;-><init>()V

    sput-object v0, Lr50$a;->a:Lr50;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lr50;
    .locals 1

    sget-object v0, Lr50$a;->a:Lr50;

    return-object v0
.end method
