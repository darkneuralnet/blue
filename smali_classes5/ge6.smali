.class public Lge6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LtM4<",
        "TZ;TZ;>;"
    }
.end annotation


# static fields
.field public static final a:Lge6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lge6<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lge6;

    invoke-direct {v0}, Lge6;-><init>()V

    sput-object v0, Lge6;->a:Lge6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LtM4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "LtM4<",
            "TZ;TZ;>;"
        }
    .end annotation

    sget-object v0, Lge6;->a:Lge6;

    return-object v0
.end method


# virtual methods
.method public a(LVL4;Lsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TZ;>;",
            "Lsy3;",
            ")",
            "LVL4<",
            "TZ;>;"
        }
    .end annotation

    return-object p1
.end method
