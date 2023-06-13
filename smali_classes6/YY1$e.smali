.class public LYY1$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static final a:LZs5$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZs5$b<",
            "LYY1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:LZs5$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZs5$b<",
            "LYY1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "map"

    const-class v1, LYY1;

    invoke-static {v1, v0}, LZs5;->a(Ljava/lang/Class;Ljava/lang/String;)LZs5$b;

    move-result-object v0

    sput-object v0, LYY1$e;->a:LZs5$b;

    const-string v0, "size"

    invoke-static {v1, v0}, LZs5;->a(Ljava/lang/Class;Ljava/lang/String;)LZs5$b;

    move-result-object v0

    sput-object v0, LYY1$e;->b:LZs5$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
