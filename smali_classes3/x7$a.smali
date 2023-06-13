.class public final Lx7$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lx7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7;

    invoke-direct {v0}, Lx7;-><init>()V

    sput-object v0, Lx7$a;->a:Lx7;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lx7;
    .locals 1

    sget-object v0, Lx7$a;->a:Lx7;

    return-object v0
.end method
