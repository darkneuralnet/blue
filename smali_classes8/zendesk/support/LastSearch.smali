.class Lzendesk/support/LastSearch;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final origin:Ljava/lang/String;

.field private final query:Ljava/lang/String;

.field private final resultsCount:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "mobile_sdk"

    iput-object v0, p0, Lzendesk/support/LastSearch;->origin:Ljava/lang/String;

    iput-object p1, p0, Lzendesk/support/LastSearch;->query:Ljava/lang/String;

    iput p2, p0, Lzendesk/support/LastSearch;->resultsCount:I

    return-void
.end method


# virtual methods
.method public getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/LastSearch;->query:Ljava/lang/String;

    return-object v0
.end method

.method public getResultsCount()I
    .locals 1

    iget v0, p0, Lzendesk/support/LastSearch;->resultsCount:I

    return v0
.end method
