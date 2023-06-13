.class public final LHe3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHe3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LHe3$a;",
        "",
        "LHe3;",
        "b",
        "LHe3;",
        "a",
        "()LHe3;",
        "Identity",
        "<init>",
        "()V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:LHe3$a;

.field public static final b:LHe3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LHe3$a;

    invoke-direct {v0}, LHe3$a;-><init>()V

    sput-object v0, LHe3$a;->a:LHe3$a;

    new-instance v0, LHe3$a$a;

    invoke-direct {v0}, LHe3$a$a;-><init>()V

    sput-object v0, LHe3$a;->b:LHe3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LHe3;
    .locals 1

    sget-object v0, LHe3$a;->b:LHe3;

    return-object v0
.end method
