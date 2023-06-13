package kotlin.p053io.path;

import ch.qos.logback.core.net.SyslogConstants;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", m28418f = "PathTreeWalk.kt", m28417i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, m28416l = {SyslogConstants.LOG_LOCAL7, 190, 199, 205}, m28415m = "invokeSuspend", m28414n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
/* renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1 */
/* loaded from: classes8.dex */
public final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, Continuation<? super PathTreeWalk$dfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.this$0, continuation);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01d5 -> B:36:0x0148). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01d7 -> B:36:0x0148). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        SequenceScope sequenceScope;
        ArrayDeque arrayDeque;
        DirectoryEntriesReader directoryEntriesReader;
        boolean followLinks;
        PathNode pathNode;
        Path path;
        Path path2;
        Object keyOf;
        PathTreeWalk pathTreeWalk;
        Path path3;
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean createsCycle;
        PathTreeWalk pathTreeWalk2;
        SequenceScope sequenceScope2;
        PathNode pathNode2;
        ArrayDeque arrayDeque2;
        Path path4;
        ArrayDeque arrayDeque3;
        DirectoryEntriesReader directoryEntriesReader2;
        boolean isDirectory2;
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1;
        boolean isDirectory3;
        boolean createsCycle2;
        LinkOption linkOption2;
        boolean exists2;
        boolean isDirectory4;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Path path5 = C41355g83.m39981a(this.L$5);
                        PathTreeWalk pathTreeWalk3 = (PathTreeWalk) this.L$4;
                        PathNode pathNode3 = (PathNode) this.L$3;
                        ResultKt.throwOnFailure(obj);
                        SequenceScope sequenceScope3 = (SequenceScope) this.L$0;
                        ArrayDeque arrayDeque4 = (ArrayDeque) this.L$1;
                        DirectoryEntriesReader directoryEntriesReader3 = (DirectoryEntriesReader) this.L$2;
                        pathTreeWalk$dfsIterator$1 = this;
                        SequenceScope sequenceScope4 = sequenceScope3;
                        Path path6 = path5;
                        directoryEntriesReader2 = directoryEntriesReader3;
                        PathNode next = pathNode3;
                        sequenceScope = sequenceScope4;
                        ArrayDeque arrayDeque5 = arrayDeque4;
                        PathTreeWalk pathTreeWalk4 = pathTreeWalk3;
                        arrayDeque3 = arrayDeque5;
                        LinkOption[] linkOptions = pathTreeWalk4.getLinkOptions();
                        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                        isDirectory4 = Files.isDirectory(path6, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
                        if (isDirectory4) {
                            next.setContentIterator(directoryEntriesReader2.readEntries(next).iterator());
                            arrayDeque3.addLast(next);
                        }
                        while (!arrayDeque3.isEmpty()) {
                            Iterator<PathNode> contentIterator = ((PathNode) arrayDeque3.last()).getContentIterator();
                            Intrinsics.checkNotNull(contentIterator);
                            if (contentIterator.hasNext()) {
                                next = contentIterator.next();
                                pathTreeWalk4 = pathTreeWalk$dfsIterator$1.this$0;
                                path6 = next.getPath();
                                LinkOption[] linkOptions2 = pathTreeWalk4.getLinkOptions();
                                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
                                isDirectory3 = Files.isDirectory(path6, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                                if (isDirectory3) {
                                    createsCycle2 = PathTreeWalkKt.createsCycle(next);
                                    if (!createsCycle2) {
                                        if (pathTreeWalk4.getIncludeDirectories()) {
                                            pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                            pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                            pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                            pathTreeWalk$dfsIterator$1.L$3 = next;
                                            pathTreeWalk$dfsIterator$1.L$4 = pathTreeWalk4;
                                            pathTreeWalk$dfsIterator$1.L$5 = path6;
                                            pathTreeWalk$dfsIterator$1.label = 3;
                                            if (sequenceScope.yield(path6, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            directoryEntriesReader3 = directoryEntriesReader2;
                                            path5 = path6;
                                            sequenceScope3 = sequenceScope;
                                            pathNode3 = next;
                                            arrayDeque4 = arrayDeque3;
                                            pathTreeWalk3 = pathTreeWalk4;
                                            SequenceScope sequenceScope42 = sequenceScope3;
                                            Path path62 = path5;
                                            directoryEntriesReader2 = directoryEntriesReader3;
                                            PathNode next2 = pathNode3;
                                            sequenceScope = sequenceScope42;
                                            ArrayDeque arrayDeque52 = arrayDeque4;
                                            PathTreeWalk pathTreeWalk42 = pathTreeWalk3;
                                            arrayDeque3 = arrayDeque52;
                                        }
                                        LinkOption[] linkOptions3 = pathTreeWalk42.getLinkOptions();
                                        LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(linkOptions3, linkOptions3.length);
                                        isDirectory4 = Files.isDirectory(path62, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length));
                                        if (isDirectory4) {
                                        }
                                        while (!arrayDeque3.isEmpty()) {
                                        }
                                    } else {
                                        EJ3.m109185a();
                                        throw DJ3.m110578a(path62.toString());
                                    }
                                } else {
                                    linkOption2 = LinkOption.NOFOLLOW_LINKS;
                                    exists2 = Files.exists(path62, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption2}, 1));
                                    if (exists2) {
                                        pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                        pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                        pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                        pathTreeWalk$dfsIterator$1.L$3 = null;
                                        pathTreeWalk$dfsIterator$1.L$4 = null;
                                        pathTreeWalk$dfsIterator$1.L$5 = null;
                                        pathTreeWalk$dfsIterator$1.label = 4;
                                        if (sequenceScope.yield(path62, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                arrayDeque3.removeLast();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                directoryEntriesReader2 = (DirectoryEntriesReader) this.L$2;
                arrayDeque3 = (ArrayDeque) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pathTreeWalk$dfsIterator$1 = this;
                while (!arrayDeque3.isEmpty()) {
                }
                return Unit.INSTANCE;
            }
            path4 = C41355g83.m39981a(this.L$5);
            pathTreeWalk2 = (PathTreeWalk) this.L$4;
            pathNode2 = (PathNode) this.L$3;
            directoryEntriesReader = (DirectoryEntriesReader) this.L$2;
            arrayDeque2 = (ArrayDeque) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            arrayDeque = new ArrayDeque();
            followLinks = this.this$0.getFollowLinks();
            directoryEntriesReader = new DirectoryEntriesReader(followLinks);
            path = this.this$0.start;
            path2 = this.this$0.start;
            keyOf = PathTreeWalkKt.keyOf(path2, this.this$0.getLinkOptions());
            pathNode = new PathNode(path, keyOf, null);
            pathTreeWalk = this.this$0;
            path3 = pathNode.getPath();
            LinkOption[] linkOptions4 = pathTreeWalk.getLinkOptions();
            LinkOption[] linkOptionArr4 = (LinkOption[]) Arrays.copyOf(linkOptions4, linkOptions4.length);
            isDirectory = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length));
            if (isDirectory) {
                createsCycle = PathTreeWalkKt.createsCycle(pathNode);
                if (!createsCycle) {
                    if (pathTreeWalk.getIncludeDirectories()) {
                        this.L$0 = sequenceScope;
                        this.L$1 = arrayDeque;
                        this.L$2 = directoryEntriesReader;
                        this.L$3 = pathNode;
                        this.L$4 = pathTreeWalk;
                        this.L$5 = path3;
                        this.label = 1;
                        if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pathTreeWalk2 = pathTreeWalk;
                        sequenceScope2 = sequenceScope;
                        pathNode2 = pathNode;
                        arrayDeque2 = arrayDeque;
                        path4 = path3;
                    }
                    LinkOption[] linkOptions5 = pathTreeWalk.getLinkOptions();
                    LinkOption[] linkOptionArr5 = (LinkOption[]) Arrays.copyOf(linkOptions5, linkOptions5.length);
                    isDirectory2 = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr5, linkOptionArr5.length));
                    if (isDirectory2) {
                        pathNode.setContentIterator(directoryEntriesReader.readEntries(pathNode).iterator());
                        arrayDeque.addLast(pathNode);
                    }
                    arrayDeque3 = arrayDeque;
                    directoryEntriesReader2 = directoryEntriesReader;
                    pathTreeWalk$dfsIterator$1 = this;
                    while (!arrayDeque3.isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                EJ3.m109185a();
                throw DJ3.m110578a(path3.toString());
            }
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path3, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = directoryEntriesReader;
                this.label = 2;
                if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            arrayDeque3 = arrayDeque;
            directoryEntriesReader2 = directoryEntriesReader;
            pathTreeWalk$dfsIterator$1 = this;
            while (!arrayDeque3.isEmpty()) {
            }
            return Unit.INSTANCE;
        }
        path3 = path4;
        arrayDeque = arrayDeque2;
        pathNode = pathNode2;
        sequenceScope = sequenceScope2;
        pathTreeWalk = pathTreeWalk2;
        LinkOption[] linkOptions52 = pathTreeWalk.getLinkOptions();
        LinkOption[] linkOptionArr52 = (LinkOption[]) Arrays.copyOf(linkOptions52, linkOptions52.length);
        isDirectory2 = Files.isDirectory(path3, (LinkOption[]) Arrays.copyOf(linkOptionArr52, linkOptionArr52.length));
        if (isDirectory2) {
        }
        arrayDeque3 = arrayDeque;
        directoryEntriesReader2 = directoryEntriesReader;
        pathTreeWalk$dfsIterator$1 = this;
        while (!arrayDeque3.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
        return ((PathTreeWalk$dfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
