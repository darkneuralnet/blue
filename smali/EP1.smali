.class public final LEP1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEP1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LEP1;",
        "",
        "LEP1$a;",
        "b",
        "LEP1$a;",
        "a",
        "()LEP1$a;",
        "Default",
        "<init>",
        "()V",
        "material-icons-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LEP1;

.field public static final b:LEP1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LEP1;

    invoke-direct {v0}, LEP1;-><init>()V

    sput-object v0, LEP1;->a:LEP1;

    sget-object v0, LEP1$a;->a:LEP1$a;

    sput-object v0, LEP1;->b:LEP1$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LEP1$a;
    .locals 1

    sget-object v0, LEP1;->b:LEP1$a;

    return-object v0
.end method
