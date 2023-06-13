.class public LuJ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLj6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LLj6<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LuJ3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LuJ3;

    invoke-direct {v0}, LuJ3;-><init>()V

    sput-object v0, LuJ3;->a:LuJ3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ldj2;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LuJ3;->b(Ldj2;F)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldj2;F)Landroid/graphics/PointF;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lzj2;->e(Ldj2;F)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method
