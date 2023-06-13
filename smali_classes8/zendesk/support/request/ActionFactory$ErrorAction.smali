.class Lzendesk/support/request/ActionFactory$ErrorAction;
.super Lzendesk/support/suas/Action;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/ActionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ErrorAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lzendesk/support/suas/Action<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final errorResponse:Lsg1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lsg1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lzendesk/support/request/ActionFactory$ErrorAction;-><init>(Ljava/lang/String;Lsg1;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lsg1;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lsg1;",
            "TE;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p3}, Lzendesk/support/suas/Action;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lzendesk/support/request/ActionFactory$ErrorAction;->errorResponse:Lsg1;

    return-void
.end method


# virtual methods
.method public getErrorResponse()Lsg1;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ActionFactory$ErrorAction;->errorResponse:Lsg1;

    return-object v0
.end method
