.class public Lde6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LXU2<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Lde6$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lde6$a<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lde6$a;

    invoke-direct {v0}, Lde6$a;-><init>()V

    sput-object v0, Lde6$a;->a:Lde6$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lde6$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lde6$a<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lde6$a;->a:Lde6$a;

    return-object v0
.end method


# virtual methods
.method public b(LQW2;)LWU2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "TModel;TModel;>;"
        }
    .end annotation

    invoke-static {}, Lde6;->c()Lde6;

    move-result-object p1

    return-object p1
.end method
