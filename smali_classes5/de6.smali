.class public Lde6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde6$a;,
        Lde6$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWU2<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Lde6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lde6<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lde6;

    invoke-direct {v0}, Lde6;-><init>()V

    sput-object v0, Lde6;->a:Lde6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lde6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lde6<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lde6;->a:Lde6;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "TModel;>;"
        }
    .end annotation

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lde6$b;

    invoke-direct {p4, p1}, Lde6$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2
.end method
