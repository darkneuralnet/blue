.class public final LSa1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvn2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0004\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR#\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001c"
    }
    d2 = {
        "LSa1;",
        "Lvn2;",
        "",
        "Lln2;",
        "b",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "visibleItemsInfo",
        "",
        "c",
        "I",
        "a",
        "()I",
        "totalItemsCount",
        "LG52;",
        "d",
        "J",
        "getViewportSize-YbymL2g",
        "()J",
        "viewportSize",
        "LEy3;",
        "e",
        "LEy3;",
        "getOrientation",
        "()LEy3;",
        "orientation",
        "<init>",
        "()V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LSa1;

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lln2;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:I

.field public static final d:J

.field public static final e:LEy3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LSa1;

    invoke-direct {v0}, LSa1;-><init>()V

    sput-object v0, LSa1;->a:LSa1;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, LSa1;->b:Ljava/util/List;

    sget-object v0, LG52;->b:LG52$a;

    invoke-virtual {v0}, LG52$a;->a()J

    move-result-wide v0

    sput-wide v0, LSa1;->d:J

    sget-object v0, LEy3;->b:LEy3;

    sput-object v0, LSa1;->e:LEy3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, LSa1;->c:I

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lln2;",
            ">;"
        }
    .end annotation

    sget-object v0, LSa1;->b:Ljava/util/List;

    return-object v0
.end method
